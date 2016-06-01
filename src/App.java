import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Define possible answers in array:
        String[] mPossibleAnswers = {"north", "south", "east", "west"};

        // Create utilities:
        Scanner scanner = new Scanner(System.in);

        // Define variables:
        String mUserAnswer;

        // Get user answer to direction to follow:
        System.out.println("Which direction would you like to go?");
        mUserAnswer = scanner.nextLine();
        for (int i = 0; i < mPossibleAnswers.length; i++) {
            if(!mUserAnswer.equals()) {
                System.out.println("Sorry, I did not understand your statement.  Try again:");
            } else {
                System.out.println("Thank you, we will go " + mUserAnswer);
            }
        }

    }
}
