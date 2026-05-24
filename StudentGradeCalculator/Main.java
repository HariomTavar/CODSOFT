package StudentGradeCalculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println(" STUDENT GRADE CALCULATOR ");
        System.out.println("==============================");

        // Student Details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        // Subject Details
        System.out.print("Enter Number Of Subjects: ");
        int numberOfSubjects = sc.nextInt();

        String[] subjects = new String[numberOfSubjects];
        int[] marks = new int[numberOfSubjects];

        // Input Subjects and Marks
        for (int i = 0; i < numberOfSubjects; i++) {

            sc.nextLine();

            System.out.print("Enter Subject Name: ");
            subjects[i] = sc.nextLine();

            // Marks Validation
            while (true) {

                System.out.print("Enter Marks (0-100): ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }

                else {
                    System.out.println("Invalid Marks! Enter Between 0 and 100.");
                }
            }
        }

        // Create Student Object
        Student student = new Student(
                name,
                rollNumber,
                course,
                numberOfSubjects,
                subjects,
                marks
        );

        // Grade Calculator Object
        GradeCalculator calculator = new GradeCalculator();

        int total = calculator.calculateTotal(marks);

        double percentage =
                calculator.calculatePercentage(total, numberOfSubjects);

        String grade =
                calculator.calculateGrade(percentage);

        String result =
                calculator.getResult(percentage);

        // Result Manager Object
        ResultManager manager = new ResultManager();

        manager.displayResult(
                student,
                total,
                percentage,
                grade,
                result
        );

        manager.saveResult(
                student,
                total,
                percentage,
                grade,
                result
        );

        sc.close();
    }
}