import java.util.*;

public class GeneratorCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**=== Password Generator ===**");
        System.out.println("DEVELOPED BY - @PRINCE THAKUR");

        // Input: Password length
        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        // Input: Character choices
        System.out.print("Include lowercase letters? (y/n): ");
        boolean useLower = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean useUpper = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean useDigits = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean useSymbols = scanner.next().equalsIgnoreCase("y");

        // Validate choice
        if (!useLower && !useUpper && !useDigits && !useSymbols) {
            System.out.println(" You must select at least one character type!");
            return;
        }

        // Generate and print password
        String password = generatePassword(length, useLower, useUpper, useDigits, useSymbols);
        System.out.println("\nGenerated Password is : " + password);
    }

    // Method to generate password
    public static String generatePassword(int length, boolean lower, boolean upper, boolean digits, boolean symbols) {
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitChars = "0123456789";
        String symbolChars = "!@#$%^&*()-_+=<>?/{}[]|";

        StringBuilder characterPool = new StringBuilder();
        Random random = new Random();

        if (lower) characterPool.append(lowerChars);
        if (upper) characterPool.append(upperChars);
        if (digits) characterPool.append(digitChars);
        if (symbols) characterPool.append(symbolChars);

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));

        }
        System.out.println("Programed by - PRINCE THAKUR");

        return password.toString();

    }

}
