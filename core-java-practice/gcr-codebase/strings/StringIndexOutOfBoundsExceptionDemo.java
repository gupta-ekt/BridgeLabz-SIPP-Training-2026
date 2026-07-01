// Write a program to demonstrate StringIndexOutOfBoundsException

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {

        String str = "Hello";

        try {
            // Valid indices: 0 to 4
            char ch = str.charAt(10);

            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred!");
            System.out.println("Index is outside the valid range of the string.");
        }
    }
}