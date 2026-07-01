import java.util.Scanner;
public class L2_Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first number: ");
        float num1 = scn.nextFloat();
        System.out.println("enter second number: ");
        float num2 = scn.nextFloat();

        float addition = num1 + num2;

        float subtraction = num1-num2;

        float multiplication = num1*num2;

        float division = num1 % num2;

        System.out.println("The addition ,subtration, multiplication and division of both number is: " + 
        "/nAdd: "+ addition + "/nSub: " + subtraction + "/nMultiplication: "+ multiplication + "/ndivision: " + division);
    }
    
}
