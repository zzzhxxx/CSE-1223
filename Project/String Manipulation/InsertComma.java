/**
 * Instert Comma into numbers
 * @author Haixing Zhu
 * @version 20240903
 */
import java.util.Scanner;

public class InsertComma {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number without commas
        System.out.print("Enter a comma-free number: ");
        
        // Read the input from the user as a string
        String number = input.nextLine(); 
        
        /*  
        As the value is between 1000-999999, so we only need to insert 
        a comma before the last three digits of the number
        Use substring to split the number into two parts:
        (1) From the start of the number up to 3 digits from the end
        (2) The last three digits
        */
        System.out.println("Number with comma is: " 
            + number.substring(0, number.length() - 3) 
            + "," 
            + number.substring(number.length() - 3));
        input.close(); 
        // Close the Scanner object to prevent resource leaks
    }

}