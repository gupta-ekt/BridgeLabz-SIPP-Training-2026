import java.io.*;

public class CustomerFeedbackAnalyzer {

    public static void main(String[] args) {

        int count = 0;

        try {

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.println("Enter 5 Feedback Messages:");

            for (int i = 1; i <= 5; i++) {

                String feedback = br.readLine();

                if (feedback.toLowerCase().contains("good")) {
                    count++;
                }
            }

            System.out.println("Good Feedback Count = " + count);

        } catch (IOException e) {

            System.out.println("Error reading input.");
        }
    }
}