/*
Question 8:
Write a program to take 2 numbers and print their quotient and remainder.
*/

import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        return new int[]{number/divisor,number%divisor};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int divisor=sc.nextInt();
        int[] result=findRemainderAndQuotient(number,divisor);
        System.out.println("Quotient: "+result[0]);
        System.out.println("Remainder: "+result[1]);
    }
}