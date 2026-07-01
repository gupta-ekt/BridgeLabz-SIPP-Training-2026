import java.util.Scanner;
public class L1_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();
        double total = 0.0;

        while(value!=0){
            total+=value;

            System.out.println("enter the number: ");
            value = scn.nextDouble();
        }
        System.out.println("total sum = "+total);
    };
    
};
