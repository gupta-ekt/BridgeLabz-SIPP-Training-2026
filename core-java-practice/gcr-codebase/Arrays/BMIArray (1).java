import java.util.Scanner;

public class BMIArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (m): ");
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nDetails:");

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + weight[i]);
            System.out.println("Height : " + height[i]);
            System.out.printf("BMI : %.2f%n", bmi[i]);
            System.out.println("Status : " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}