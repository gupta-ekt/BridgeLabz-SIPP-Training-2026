import java.util.Scanner;
public class L3_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the value of base in cm: ");
        int base = scn.nextInt();

        System.out.println("enter the value fo height in cm: ");
        int height = scn.nextInt();

        double parameter = 0.5*base*height;

        System.out.println(parameter);

    }
    
}
