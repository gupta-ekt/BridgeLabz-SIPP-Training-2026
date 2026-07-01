// A security application receives a secret code.
// Write a program that:
// Accepts a string.
// Counts vowels, consonants, digits, and special characters.
// Determines whether the code is "Strong" or "Weak" based on:
// At least 2 digits
// At least 1 special character
// Minimum length of 8
// Displays a detailed report.


import java.util.Scanner;
public class Secret_Message_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the secret code: ");
        String secretCode = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char c : secretCode.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                specialCharCount++;
            }
        }

        boolean isStrong = (digitCount >= 2) && (specialCharCount >= 1) && (secretCode.length() >= 8);

        // Display the detailed report
        System.out.println("Detailed Report:");
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharCount);
        System.out.println("Code Strength: " + (isStrong ? "Strong" : "Weak"));
    }
}