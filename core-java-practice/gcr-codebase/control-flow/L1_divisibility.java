import java.util.Scanner;

public class L1_divisibility {

    static void divisible(int num){

        if(num % 5 == 0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number you want to check divisibility of: ");
        int num = scn.nextInt();

        L1_divisibility.divisible(num);

        scn.close();
    }
}