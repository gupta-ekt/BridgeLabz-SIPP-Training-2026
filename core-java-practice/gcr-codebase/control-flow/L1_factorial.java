import java.util.Scanner;
public class L1_factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        long factorial =1;
        int i=1;

        while(i<=num){
           factorial*=i;
           i++;
        }
        System.out.println(factorial);
        
        
    }
    
}
