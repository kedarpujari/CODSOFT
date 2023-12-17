import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator :");

        System.out.print("Enter marks for OOps : ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Computer Networks : ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Data Science : ");
        double subject3 = scanner.nextDouble();

        System.out.print("Enter marks for Database Management System : ");
        double subject4 = scanner.nextDouble();

        System.out.print("Enter marks for Discrete Mathematics : ");
        double subject5 = scanner.nextDouble();

        double average = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;

        char grade = calculateGrade(average);

        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
