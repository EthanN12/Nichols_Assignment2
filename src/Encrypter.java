public class Encrypter {
    private int userinput;
//setup encryption of the 4 digits
    public static int encrypt (int userinput) {
        int First, Second, Third, Fourth, EncryptedNumber;

        First = userinput / 1000;
        Second = userinput / 100 % 10;
        Third = userinput / 10 % 10;
        Fourth = userinput % 10;

        First = (First + 7) % 10;
        Second = (Second + 7) % 10;
        Third = (Third + 7) % 10;
        Fourth = (Fourth + 7) % 10;

        EncryptedNumber = (Third * 1000) + (Fourth * 100) + (First * 10) + (Second);

        return EncryptedNumber;

    }

}