import java.util.Scanner;

public class BMICalculator {

    static final String METRIC = "METRIC";
    static final String IMPERIAL = "IMPERIAL";

    static Scanner in = new Scanner(System.in);

    private double weight;
    private double height;
    private double bmi;
    private String unitType;

    /*return the weight*/
    public double getWeight() {
        return weight;
    }

    /*set the weight*/
    private void setWeight(double weight) {
        this.weight = weight;
    }

    /*return the height*/
    public double getHeight() {
        return height;
    }

    /*height of the user*/
    private void setHeight(double height) {
        this.height = height;
    }

    /*user data*/
    public void readUserData() {
        // Get unit type from user
        readUnitType();

        //weight and height of the user
        readMeasurementData();
    }

    /*unit type*/
    private void readUnitType() {
        System.out.print("Please enter the Unit Type ["+IMPERIAL+" or "+METRIC+"]: ");
        String unit = in.nextLine().trim().toUpperCase();

        if (unit.equals(IMPERIAL) || unit.equals(METRIC)) {

            this.unitType = unit;
        } else {

            System.out.print("Please enter a valid value!!!\n");

            readUnitType();
        }
    }

    /*weight and height values*/
    private void readMeasurementData() {
        // unitType
        if (unitType.equals(IMPERIAL))
            readImperialData();
        else
            readMetricData();
    }

    /*metric values*/
    private void readMetricData() {
        //weight in kilograms
        System.out.print("\nPlease enter weight in kilograms: ");
        setWeight(in.nextDouble());

        //weight is negative
        if (getWeight() < 0.0)
            System.exit(1);

        //height in meters
        System.out.print("Please enter height in meters: ");
        setHeight(in.nextDouble());

        //height is negative
        if (getHeight() < 0.0)
            System.exit(1);
    }

    /*measurement in imperial*/
    private void readImperialData() {
        //weight in pounds
        System.out.print("\nPlease enter weight in pounds: ");
        setWeight(in.nextDouble());

        //weight is negative
        if (getWeight() < 0.0)
            System.exit(1);

        //height in inches
        System.out.print("Please enter height in inches: ");
        setHeight(in.nextDouble());

        //if height is negative
        if (getHeight() < 0.0)
            System.exit(1);
    }

    /*calculate and set the BMI*/
    public void calculateBmi() {
        // Calculate BMI
        bmi = weight / (height * height);

        // If unitType is Imperial multiply bmi by 703
        if (unitType.equals(IMPERIAL))
            bmi = 703 * bmi;
    }

    /*return the BMI*/
    public double getBmi() {
        return bmi;
    }

    /* This method displays the BMI.*/
    public void displayBmi() {
        System.out.print("\n********************************");
        // Display BMI
        System.out.printf("\nBMI: %.1f", getBmi());
        // Display BMI category
        System.out.print("\n " + getBMIcategory());
    }

    /*BMI category*/
    public String getBMIcategory() {
        // Find BMI Category
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi <= 24.9)
            return "Normal weight";
        else if (bmi <= 29.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        BMICalculator app = new BMICalculator();
        app.readUserData();
        app.calculateBmi();
        app.displayBmi();
    }
}
