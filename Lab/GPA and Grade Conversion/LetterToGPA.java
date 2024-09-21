import java.util.Scanner;

public class LetterToGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterGrade = input.nextLine();
        double gpa=0.0;
        boolean valid = false;
        if (letterGrade.equals("A+")) {
            gpa = 4.0;
        } else if (letterGrade.equals("A")) {
            gpa = 4.0;
        } else if (letterGrade.equals("A-")) {
            gpa = 3.7;
        } else if (letterGrade.equals("B+")) {
            gpa = 3.3;
        } else if (letterGrade.equals("B")) {
            gpa = 3.0;
        } else if (letterGrade.equals("B-")) {
            gpa = 2.7;
        } else if (letterGrade.equals("C+")) {
            gpa = 2.3;
        } else if (letterGrade.equals("C")) {
            gpa = 2.0;
        } else if (letterGrade.equals("C-")) {
            gpa = 1.7;
        } else if (letterGrade.equals("D+")) {
            gpa = 1.3;
        } else if (letterGrade.equals("D")) {
            gpa = 1.0;
        }  else if (letterGrade.equals("E")) {
            gpa = 0.0;
        } else {
            valid=true;
        }
        if (valid) {
            System.out.println(letterGrade + " is not a valid letter grade.");
        } else {
            System.out.printf("Your GPA is: %.1f\n", gpa);
        }
        System.out.println("Goodbye!");
    }

}