import java.util.Scanner;
public class L3_leap_year {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();

        if(year>=1582){
            if(year%4==0 && year%400==0){
                System.out.println("year is leap year");
            }
        }
        else{
            System.out.println("not a leap year");
        }
    }
    
}
