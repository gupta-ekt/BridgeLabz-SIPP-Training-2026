import java.util.Scanner;

public class UppercaseConversionComparison {

    public static String toUpperCaseCustom(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String custom = toUpperCaseCustom(text);
        String builtin = text.toUpperCase();

        System.out.println("Custom Uppercase : " + custom);
        System.out.println("Built-in Uppercase: " + builtin);

        System.out.println("Are both equal? " + custom.equals(builtin));

        sc.close();
    }
}