// Write a program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class LowercaseConversionComparison {

    public static String toLowerCaseCustom(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = toLowerCaseCustom(text);
        String builtin = text.toLowerCase();

        System.out.println("Custom Lowercase : " + custom);
        System.out.println("Built-in Lowercase: " + builtin);

        System.out.println("Are both equal? " + custom.equals(builtin));

        sc.close();
    }
}