import java.util.Scanner;

public class BMI2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (m): ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson Details");

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0]);
            System.out.println("Height : " + personData[i][1]);
            System.out.printf("BMI : %.2f%n", personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}