// Write a program to create a substring from a String using the charAt() method. Also, use
// the String built-in method substring() to find the substring of the text. Finally Compare the
// the two strings and display the results
import java.util.Scanner;

public class SubstringUsingCharAtAndSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Creating substring using charAt()
        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 += str.charAt(i);
        }

        // Creating substring using built-in substring()
        String sub2 = str.substring(start, end);

        System.out.println("\nSubstring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        // Comparing both substrings
        if (sub1.equals(sub2)) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Both substrings are not equal.");
        }

        sc.close();
    }
}