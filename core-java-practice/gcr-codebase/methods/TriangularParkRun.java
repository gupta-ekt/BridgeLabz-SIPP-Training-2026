/*
Question 3:
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete.
*/

import java.util.Scanner;

public class TriangularParkRun {
    public static double calculateRounds(double a,double b,double c){
        return 5000/(a+b+c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(calculateRounds(a,b,c));
    }
}