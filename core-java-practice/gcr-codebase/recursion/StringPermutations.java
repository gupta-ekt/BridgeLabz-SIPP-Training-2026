import java.util.Scanner;

public class StringPermutations {

    static void permute(String str, String answer) {

        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String remaining = left + right;

            permute(remaining, answer + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Permutations:");

        permute(str, "");

        sc.close();
    }
}