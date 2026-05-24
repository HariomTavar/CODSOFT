package NumberGame;

import java.io.*;

public class ScoreManager {

    private final String FILE_NAME = "scores.txt";

    // Save High Score
    public void saveHighScore(int score) {

        int currentHighScore = getHighScore();

        if (score > currentHighScore) {

            try {
                FileWriter writer = new FileWriter(FILE_NAME);
                writer.write(String.valueOf(score));
                writer.close();

                System.out.println("New High Score Saved!");

            } catch (IOException e) {
                System.out.println("Error Saving Score!");
            }
        }
    }

    // Read High Score
    public int getHighScore() {

        int highScore = 0;

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                return 0;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();

            if (line != null) {
                highScore = Integer.parseInt(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error Reading Score!");
        }

        return highScore;
    }

    // Display High Score
    public void viewHighScore() {

        int highScore = getHighScore();

        System.out.println("\n===== HIGH SCORE =====");
        System.out.println("High Score: " + highScore);
    }
}