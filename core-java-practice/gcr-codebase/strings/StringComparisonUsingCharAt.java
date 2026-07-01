// Write a program to compare two strings using the charAt() method and check the result
// with the built-in String equals() method
import java.util.Scanner;

public class StringComparisonUsingCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean areEqual = true;

        if (str1.length() != str2.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("\nComparison using charAt():");
        if (areEqual) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.println("\nComparison using equals():");
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        sc.close();
    }
}