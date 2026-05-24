package StudentGradeCalculator;

public class Student {

    String name;
    int rollNumber;
    String course;

    int numberOfSubjects;

    String[] subjects;
    int[] marks;

    // Constructor
    public Student(String name,
                   int rollNumber,
                   String course,
                   int numberOfSubjects,
                   String[] subjects,
                   int[] marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;

        this.numberOfSubjects = numberOfSubjects;

        this.subjects = subjects;
        this.marks = marks;
    }
}