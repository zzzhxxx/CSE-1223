import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of classes you have: ");
        int numClasses = input.nextInt();
        double[] grades = new double[numClasses];
        int[] credit = new int[numClasses];
        String[] name = new String[numClasses];
        for(int i=0;i<numClasses;i++) {
            System.out.print("Please enter class " + (i+1) + " name: ");
            name[i]= input.next();
            System.out.print("Please enter class " + (i+1) + " grade: ");
            String grade = input.next();
            System.out.println("Please enter class " + (i+1) + " credit hours: ");
            credit[i] = input.nextInt();
            grades[i] = GradeToGPA(grade);
        }
    int totalCredits = 0;
    System.out.println("Class\tGPA\tCredit");
    for(int i=0;i<numClasses;i++) {
        System.out.println(name[i]+"\t"+grades[i]+"\t"+credit[i]);
        totalCredits += credit[i];
    }
    System.out.printf("Total\t%.2f\t%d\n\n", getGPA(numClasses, grades, credit, totalCredits), totalCredits);
}
    public static double GradeToGPA(String letterGrade) {
        double gpa = 0.0;
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
        }
        return gpa;
    }
     public static double getGPA(int numClass, double[] grades, int[] credits, int totalCredits) {
       //TODO: calculate total GPA of student
        double finalGPA = 0.0;
        for(int i=0; i < numClass; i++){
            finalGPA += grades[i] * credits[i];  // Calculate the weighted GPA for each class.
        }
     return finalGPA/ totalCredits;
    }

    

}