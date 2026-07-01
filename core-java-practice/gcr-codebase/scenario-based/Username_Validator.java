// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.


import java.util.Scanner;

public class Username_Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        // Check if the username contains any spaces
        boolean hasSpaces = username.contains(" ");

        // Count the total number of characters
        int charCount = username.length();

        // Convert the username to uppercase
        String uppercaseUsername = username.toUpperCase();

        // Check if the username is a palindrome
        boolean isPalindrome = isPalindrome(username);

        // Display the results
        System.out.println("Username: " + username);
        System.out.println("Contains spaces: " + hasSpaces);
        System.out.println("Total characters: " + charCount);
        System.out.println("Uppercase: " + uppercaseUsername);
        System.out.println("Is palindrome: " + isPalindrome);

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for comparison
        str = str.replace(" ", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}