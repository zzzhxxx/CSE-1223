/**
 * This program converts letter grades into GPA values based on a 4.0 scale
 * and calculates the final GPA of a student based on their grades and credit hours.
 *
 * @author Haixing Zhu
 * @version 20240921
 */
 
 import java.util.Scanner;

 public class LetterToGPA {
 
     /**
      * This method converts a letter grade into its corresponding GPA value.
      * 
      * @param letter The letter grade (e.g., "A", "B+", etc.)
      * @return The corresponding GPA value, where 4.0 is the highest.
      */
     public static double changeGrade(String letter){
         double grade = 0.0;
         
         // Convert the letter grade to the corresponding GPA value.
         if(letter.equals("A")){
             grade = 4.0;
         } else if(letter.equals("A-")){
             grade = 3.7;
         } else if(letter.equals("B+")){
             grade = 3.3;
         } else if(letter.equals("B")){
             grade = 3.0;
         } else if(letter.equals("B-")){
             grade = 2.7;
         } else if(letter.equals("C+")){
             grade = 2.3;
         } else if(letter.equals("C")){
             grade = 2.0;
         } else if(letter.equals("C-")){
             grade = 1.7;
         } else if(letter.equals("D+")){
             grade = 1.3;
         } else if(letter.equals("D")){
             grade = 1.0;
         } else if(letter.equals("E")){
             grade = 0.0;
         } 
         
         // Return the GPA value corresponding to the letter grade.
         return grade;
     }
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);  // Create a Scanner object to receive user input.
         
         // Prompt the user to input the letter grades and credit hours for four classes.
         System.out.println("Please insert the letter grades and credit hours for your four classes below once prompted.");
         
         double[] credits = new double[4];  // Array to store credit hours for four classes.
         double[] numGrades = new double[4];  // Array to store GPA values for four classes.
         double totalCredits = 0.0;  // Total number of credits.
         double finalGPA = 0.0;  // Final GPA result.
         
         // Loop through 4 classes to get input for each class's letter grade and credit hours.
         for(int i=0; i < 4; i++){
             System.out.print("Enter a letter grade: ");  // Prompt user to input a letter grade.
             String letterGrade = input.next();  // Receive user input for the letter grade.
             numGrades[i] = changeGrade(letterGrade);  // Convert the letter grade to GPA.
             
             System.out.print("Enter the associated credit hours: ");  // Prompt user for credit hours.
             credits[i] = input.nextInt()*1.0;  // Store the input credit hours.
             totalCredits += credits[i];  // Add credit hours to the total.
             finalGPA += numGrades[i] * credits[i];  // Calculate the weighted GPA for each class.
        }
        
        // Calculate the final GPA as the weighted average of all classes.
         finalGPA = finalGPA / totalCredits;
         
         // Output the GPA and credits for each class.
         System.out.printf("GPA\t|\tCredit\n-------------------\n");
         for(int i=0; i < 4; i++){
             System.out.printf("%.1f\t|\t%.1f\n", numGrades[i], credits[i]);
         }
         
         // Output the final GPA result.
         System.out.print("\nYour Final GPA is: "+Double.toString(finalGPA)+"\nGoodbye!\n");
     }
 
 }
 