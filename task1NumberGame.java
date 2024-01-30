import java.util.*;

public class task1NumberGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int choice, attempts, rounds = 0;
        while (true) {
            System.out.println("ROUND " + (++rounds));
            attempts = 0;
            System.out.println("Guess a number between 1 and 100");
            while (++attempts <= 3) {
                int generatedNumber = (int) (Math.random() * 100 + 1);
                System.out.println("Attempt " + attempts);
                int guessedNumber = sc.nextInt();
                if (guessedNumber == generatedNumber) {
                    score++;
                    System.out.println("CORRECT");
                    break;
                } else {
                    if (guessedNumber > generatedNumber + 20) {
                        System.out.println("YOUR GUESS IS TOO HIGH");
                    } else if (guessedNumber + 20 < generatedNumber) {
                        System.out.println("YOUR GUESS IS TOO LOW");
                    } else if (guessedNumber > generatedNumber) {
                        System.out.println("YOUR GUESS IS HIGH");
                    } else {
                        System.out.println("YOUR GUESS IS LOW");
                    }
                    if (attempts == 3) {
                        System.out.println("YOU LOST");
                    }
                }
            }
            System.out.println("YOUR SCORE : " + score);
            System.out.println("Press 1 to play next round or press 0 to exit the game");
            choice = sc.nextInt();
            if (choice == 1)
                continue;
            else {
                System.out.println("Thanks for playing the game!");
                System.exit(0);
            }
        }
    }
}
