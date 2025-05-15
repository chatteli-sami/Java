import java.util.Random;

public class NumbersGame {

    public static void main(String[] args) {
        while (true) {
            playGame();
            System.out.println("Would you like to play again? (y/n)");
            String input = System.console().readLine();
            if (!input.equalsIgnoreCase("y")) {
                System.out.println("Being a quitter isn't so bad sometimes. Goodbye!");
                break;
            }
        }
    }

    public static void playGame() {
        Random random = new Random();
        int answer = random.nextInt(11);

        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number? (You have 3 attempts. Type 'q' to quit.)");

        int attempts = 0;

        while (attempts < 3) {
            String guessInput = System.console().readLine();
            if (guessInput.equalsIgnoreCase("q")) {
                System.out.println("I knew you didn't have it in you.");
                return;
            }

            int guess;
            try {
                guess = Integer.parseInt(guessInput);
            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number. Please enter a number between 0 and 10.");
                continue;
            }

            if (guess < 0 || guess > 10) {
                System.out.println("Your guess must be between 0 and 10. Try again.");
                continue;
            }

            attempts++;
            if (guess == answer) {
                System.out.println("Lucky guess! You got it right!");
                return;
            } else {
                if (attempts < 3) {
                    System.out.println("Swing and a miss! Keep trying...");
                }
            }
        }
        System.out.println(
                "You've used all your attempts. You have failed, pathetic human. The correct answer was: " + answer);
    }
}
