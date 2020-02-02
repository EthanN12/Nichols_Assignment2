import java.util.Scanner;
//create the menu the user will see to input their 4 digit value
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a four digit integer:");
        int theInt = input.nextInt();
//print out the encrypted/decrypted numbers
        System.out.printf("%s%d%n", "Encrypted Value: ", Encrypter.encrypt(theInt));
        System.out.printf("%s%d%n", "Decrypted value: ", Decrypter.decrypt(Encrypter.encrypt(theInt)));

    }
}