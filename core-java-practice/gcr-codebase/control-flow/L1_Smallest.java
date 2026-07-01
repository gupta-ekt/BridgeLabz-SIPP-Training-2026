import java.util.Scanner;
public class L1_Smallest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("number 1 is the biggest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("number 2 is the biggest");
        }
        else{
            System.out.println("number 3 is the biggest");
        }

    }  
}
