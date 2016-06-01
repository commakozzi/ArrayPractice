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
        // This is not the way to do this.  This will just print each line, but
        // it will print "Thank you, we will go, etc." on the line that matches.
        /*
        System.out.println("Which direction would you like to go?");
        mUserAnswer = scanner.nextLine();
        for (int i = 0; i < mPossibleAnswers.length; i++) {
            if(!mUserAnswer.equals(mPossibleAnswers[i])) {
                System.out.println("Sorry, I did not understand your statement.  Try again:");
            } else {
                System.out.println("Thank you, we will go " + mUserAnswer);
            }
        }
        */

        /*
        for (int i = 0; i < mPossibleAnswers.length; i++) {
            System.out.println(mPossibleAnswers[i]);
        }
        */

        /*
        String[] words = new String[10];
        words[0] = "hello";
        words[1] = "fuck you";

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        */

        String[][] text = {
                {"hello"}, {"no"}, {"yes"},
                {"fart"}, {"pillow"}, {"dove"},
                {"frank"}, {"in-furter"}, {"probably"}
        };

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                System.out.printf(text[i][j]);
            }
        }

    }
}
