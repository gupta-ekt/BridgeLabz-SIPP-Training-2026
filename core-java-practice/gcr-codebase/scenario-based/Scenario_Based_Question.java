// A warehouse stores item quantities in an array. Find the max, min, total stock, and detect duplicates. Extend: rotate the stock array by k positions (simulate daily shift handover), and transpose a 2D shelf grid.

import java.util.Scanner;

public class Scenario_Based_Question {
    public static void FindMinMaxTotal(int[] stock) {
        int max = stock[0];
        int min = stock[0];
        int totalStock = 0;

        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }
            if (quantity < min) {
                min = quantity;
            }
            totalStock += quantity;
        }

        System.out.println("Max quantity: " + max);
        System.out.println("Min quantity: " + min);
        System.out.println("Total stock: " + totalStock);
    }

    public static void detectDuplicates(int[] stock) {
        boolean hasDuplicates = false;
        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("There are duplicate quantities in the stock.");
        } else {
            System.out.println("There are no duplicate quantities in the stock.");
        }
    }

    public static void transpose2DGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = grid[i][j];
            }
        }
        System.out.println("Original 2D Shelf Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed 2D Shelf Grid:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        System.out.println("Original stock array:");
        for (int quantity : arr) {
            System.out.print(quantity + " ");
        }
        System.out.println();

        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
        // Reverse the first k elements
        reverseArray(arr, 0, k - 1);
        // Reverse the remaining elements
        reverseArray(arr, k, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find Min, Max, Total Stock
        System.out.println("Enter the number of items in stock:");
        int n = sc.nextInt();
        int[] stock = new int[n];

        System.out.println("Enter the quantities of each item:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        FindMinMaxTotal(stock);

        // Detect Duplicates
        detectDuplicates(stock);

        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter the 2D shelf grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Transpose 2D Grid
        transpose2DGrid(grid);

        // Rotate Array
        System.out.println("Enter the number of positions to rotate the stock array:");
        int k = sc.nextInt();
        rotateArray(stock, k);

        System.out.println("Stock array after rotation:");
        for (int quantity : stock) {
            System.out.print(quantity + " ");
        }
    }
}