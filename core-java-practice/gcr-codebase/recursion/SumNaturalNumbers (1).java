import java.util.Scanner;

public class SumNaturalNumbers {

    static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            System.out.println("Sum = " + sum(n));
        }

        sc.close();
    }
}