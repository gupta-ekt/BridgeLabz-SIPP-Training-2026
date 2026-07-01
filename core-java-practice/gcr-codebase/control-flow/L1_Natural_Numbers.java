import java.util.Scanner;
public class L1_Natural_Numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if(num >=0){
            System.out.println("it is a natural number and sum ");

            
            int sum = num*(num+1)/2;

            System.out.println("sum of n natural numbers is: " + sum);
        }
        else{
            System.out.println("not a natural number");
        }
    }
}
