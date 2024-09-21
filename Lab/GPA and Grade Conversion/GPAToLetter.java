import java.util.Scanner;

public class GPAToLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a GPA: ");
        double gpa = input.nextDouble();
        String letterGrade = "Not Convertible";
        if (gpa <= 4.0 && gpa > 3.7){
            letterGrade = "A";
        } else if (gpa > 3.3 && gpa <= 3.7){
            letterGrade = "A-";
        } else if (gpa <= 3.3 && gpa > 3.0){
            letterGrade = "B+";
        } else if (gpa <= 3.0 && gpa > 2.7){
            letterGrade = "B";
        } else if (gpa <= 2.7 && gpa > 2.3){
            letterGrade = "B-";
        } else if (gpa <= 2.3 && gpa > 2.0){
            letterGrade = "C+";
        } else if (gpa <= 2.0 && gpa > 1.7){
            letterGrade = "C";
        } else if (gpa <= 1.7 && gpa > 1.3){
            letterGrade = "C-";
        } else if (gpa <= 1.3 && gpa > 1.0){
            letterGrade = "D+";
        } else if (gpa <= 1.0 && gpa > 0){
            letterGrade = "D";
        }
        System.out.println("Your letter grade is: " + letterGrade);
        System.out.println("Goodbye!");
    }

}