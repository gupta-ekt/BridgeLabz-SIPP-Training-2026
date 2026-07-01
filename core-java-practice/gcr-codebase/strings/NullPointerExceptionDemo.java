// Write a program to demonstrate NullPointerException.

public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        String str = null;

        try {
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
            System.out.println("You are trying to access a method on a null object.");
        }
    }
}