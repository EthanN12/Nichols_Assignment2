public class Decrypter {
    private int userinput;
//setup decryption of the 4 digits
    public static int decrypt (int userinput) {
        int First, Second, Third, Fourth, DecryptedNumber;

        First = userinput / 1000;
        Second = userinput / 100 % 10;
        Third = userinput / 10 % 10;
        Fourth = userinput % 10;

        First = (First + 3) % 10;
        Second = (Second + 3) % 10;
        Third = (Third + 3) % 10;
        Fourth = (Fourth + 3) % 10;

        DecryptedNumber = (Third * 1000) + (Fourth * 100) + (First * 10) + (Second);

        return DecryptedNumber;

    }

}