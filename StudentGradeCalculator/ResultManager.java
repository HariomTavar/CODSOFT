package StudentGradeCalculator;
import java.io.FileWriter;
import java.io.IOException;

public class ResultManager {

    // Display Result
    public void displayResult(Student student,
                              int total,
                              double percentage,
                              String grade,
                              String result) {

        System.out.println("\n==============================");
        System.out.println("       STUDENT REPORT");
        System.out.println("==============================");

        System.out.println("Name       : " + student.name);
        System.out.println("Roll No    : " + student.rollNumber);
        System.out.println("Course     : " + student.course);

        System.out.println("--------------------------------");

        for (int i = 0; i < student.numberOfSubjects; i++) {

            System.out.println(student.subjects[i]
                    + " : "
                    + student.marks[i]);
        }

        System.out.println("--------------------------------");

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);

        System.out.println("==============================");
    }

    // Save Result To File
    public void saveResult(Student student,
                           int total,
                           double percentage,
                           String grade,
                           String result) {

        try {

            FileWriter writer = new FileWriter("results.txt", true);

            writer.write("\n====================\n");

            writer.write("Name : " + student.name + "\n");
            writer.write("Roll No : " + student.rollNumber + "\n");
            writer.write("Course : " + student.course + "\n");

            writer.write("--------------------------------\n");

            for (int i = 0; i < student.numberOfSubjects; i++) {

                writer.write(student.subjects[i]
                        + " : "
                        + student.marks[i]
                        + "\n");
            }

            writer.write("--------------------------------\n");

            writer.write("Total Marks : " + total + "\n");

            writer.write("Percentage : "
                    + percentage
                    + "%\n");

            writer.write("Grade : " + grade + "\n");

            writer.write("Result : " + result + "\n");

            writer.write("====================\n");

            writer.close();

            System.out.println("Result Saved Successfully!");

        }

        catch (IOException e) {

            System.out.println("Error Saving Result!");
        }
    }
}