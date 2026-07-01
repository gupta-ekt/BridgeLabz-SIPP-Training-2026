// A recruitment portal receives two skill keywords from a candidate.
// Write a program that:
// Accepts two strings.
// Checks whether they are anagrams.
// Displays both strings in uppercase.
// Shows the total length of each string.
// Prints a suitable message based on the result.

import java.util.Scanner;

public class Word_Match_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Convert both strings to uppercase
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        // Check if the strings are anagrams
        boolean isAnagram = areAnagrams(str1, str2);

        // Display the results
        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        System.out.println("Length of First String: " + str1.length());
        System.out.println("Length of Second String: " + str2.length());
        System.out.println("Are they anagrams? " + isAnagram);
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lowercase for comparison
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths are different, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create arrays to count character frequencies
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters in both strings
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}
