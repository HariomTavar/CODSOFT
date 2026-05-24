package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    ScoreManager scoreManager = new ScoreManager();

    public void startGame() {

        int level;
        int maxNumber = 100;
        int attempts = 5;

        System.out.println("\nSelect Difficulty Level");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-500)");
        System.out.print("Enter choice: ");

        level = sc.nextInt();

        switch (level) {

            case 1:
                maxNumber = 50;
                attempts = 10;
                break;

            case 2:
                maxNumber = 100;
                attempts = 7;
                break;

            case 3:
                maxNumber = 500;
                attempts = 5;
                break;

            default:
                System.out.println("Invalid Choice! Medium mode selected.");
        }

        int number = random.nextInt(maxNumber) + 1;
        boolean guessed = false;

        System.out.println("\nGuess the number between 1 and " + maxNumber);

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Enter Guess: ");
            int guess = sc.nextInt();

            if (guess == number) {

                System.out.println("Correct Guess!");
                guessed = true;

                int score = (attempts - i + 1) * 10;

                System.out.println("Your Score: " + score);

                scoreManager.saveHighScore(score);

                break;
            }

            else if (guess > number) {
                System.out.println("Too High!");
            }

            else {
                System.out.println("Too Low!");
            }

            System.out.println("Attempts Left: " + (attempts - i));

            // Hint System
            if (number % 2 == 0) {
                System.out.println("Hint: Number is Even");
            }
            else {
                System.out.println("Hint: Number is Odd");
            }
        }

        if (!guessed) {
            System.out.println("\nYou Lost!");
            System.out.println("Correct Number was: " + number);
        }
    }
}