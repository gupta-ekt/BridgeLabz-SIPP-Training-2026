// Write a program to return all the characters in a string using the user-defined method,
// compare the result with the String built-in toCharArray() method, and display the result
import java.util.Scanner;

public class CharactersUsingMethodAndToCharArray {

    // User-defined method to return characters of a string
    public static char[] getCharacters(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // User-defined method
        char[] arr1 = getCharacters(str);

        // Built-in method
        char[] arr2 = str.toCharArray();

        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : arr1) {
            System.out.print(ch + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }

        // Compare arrays
        boolean same = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                same = false;
                break;
            }
        }

        System.out.println("\n");
        if (same) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Both results are different.");
        }

        sc.close();
    }
}