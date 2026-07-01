// Write a program to demonstrate NumberFormatException
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        String str = "ABC123";

        try {
            int num = Integer.parseInt(str);

            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred!");
            System.out.println("Cannot convert the given string into an integer.");
        }
    }
}