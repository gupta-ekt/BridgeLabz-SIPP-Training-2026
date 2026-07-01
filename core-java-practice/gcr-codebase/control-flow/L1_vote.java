import java.util.Scanner;
public class L1_vote {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();

        if(age>=18){
            System.out.println("person i seligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
    
}
