//Ravi just joined a company ,Store his name , age,rank and Salary and membership fee(float) in a variable and print a welcome card to him and also calculate his annual bonus which is 12% of his salary.

import java.util.Scanner;

public class RaviBasedQuestion {
    String name;
    int age;
    int rank;
    long Salary;
    float memebership_fee;

    int calculateBonus(long salary){
        return (int)((salary * 12)/100);
    }

    void ShowWelcomeCard(){
        System.out.println("Welcome " + name + " to the company!");
        System.out.println("Your age is: " + age);
        System.out.println("Your rank is: " + rank);
        System.out.println("Your salary is: " + Salary);
        System.out.println("Your membership fee is: " + memebership_fee);
        System.out.println("Your annual bonus is: " + calculateBonus(Salary));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        RaviBasedQuestion ravi = new RaviBasedQuestion();
        ravi.name = sc.nextLine();
        ravi.age = sc.nextInt();
        ravi.rank = sc.nextInt();
        ravi.Salary = sc.nextLong();
        ravi.memebership_fee = sc.nextFloat();
        

        //Print a Welcome Card
        ravi.ShowWelcomeCard();
    }
}
