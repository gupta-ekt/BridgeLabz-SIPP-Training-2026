import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks!");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A+";
            else if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else
                grade[i] = "F";
        }

        System.out.println("\nStudent Details");

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));
            System.out.println("Physics : " + physics[i]);
            System.out.println("Chemistry : " + chemistry[i]);
            System.out.println("Maths : " + maths[i]);
            System.out.printf("Percentage : %.2f%n", percentage[i]);
            System.out.println("Grade : " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}