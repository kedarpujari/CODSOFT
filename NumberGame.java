import java.util.Scanner;

public class NumberGame {

    public static void NumberGuessingGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());

        int K = 5;

        int i, guess;

        System.out.println(
                "A number is chosen" + " between 1 to 100." + " \nThe user has only 5 turns to guess number.");

        for (i = 0; i < K; i++) {

            System.out.println(
                    "Guess the number:");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println(
                        "Congratulations!" + " You guessed the number.");
                break;
            } else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is " + "greater than " + guess);
            } else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is" + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "You have used all the turns to guess number.");
            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[]) {
        NumberGuessingGame();
    }
}