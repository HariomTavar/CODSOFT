package StudentGradeCalculator;
public class GradeCalculator {

    // Calculate Total Marks
    public int calculateTotal(int[] marks) {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate Percentage
    public double calculatePercentage(int total, int subjects) {

        return (double) total / subjects;
    }

    // Calculate Grade
    public String calculateGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        }

        else if (percentage >= 80) {
            return "A";
        }

        else if (percentage >= 70) {
            return "B";
        }

        else if (percentage >= 60) {
            return "C";
        }

        else if (percentage >= 50) {
            return "D";
        }

        else {
            return "F";
        }
    }

    // Pass or Fail
    public String getResult(double percentage) {

        if (percentage >= 40) {
            return "PASS";
        }

        return "FAIL";
    }
}