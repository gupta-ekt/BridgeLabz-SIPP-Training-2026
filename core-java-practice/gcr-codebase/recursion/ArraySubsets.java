import java.util.Scanner;

public class ArraySubsets {

    static void generateSubsets(int[] arr, int index, String current) {

        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        generateSubsets(arr, index + 1, current);

        if (current.equals("")) {
            generateSubsets(arr, index + 1, String.valueOf(arr[index]));
        } else {
            generateSubsets(arr, index + 1, current + ", " + arr[index]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsets:");

        generateSubsets(arr, 0, "");

        sc.close();
    }
}