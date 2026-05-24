import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        ScoreManager scoreManager = new ScoreManager();

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("   ADVANCED NUMBER GAME");
            System.out.println("==============================");
            System.out.println("1. Start Game");
            System.out.println("2. View High Score");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    game.startGame();
                    break;

                case 2:
                    scoreManager.viewHighScore();
                    break;

                case 3:
                    System.out.println("Thank You For Playing!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}