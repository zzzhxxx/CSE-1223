/**
 * Format phone number
 * This program formats a 10-digit phone number into the format (XXX) XXX-XXXX.
 * @author Haixing Zhu
 * @version 20240906
 */
import java.util.Scanner;

public class InsertPhoneFormat {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a 10-digit phone number without any formatting
        System.out.print("Enter a phone number: ");
        
        // Read the input phone number as a string
        String num = input.nextLine();

        // Format the phone number
        // As the user is assumed to input a valid phone number, so there is no need to check the length of the input
        System.out.println("Your phone number is: (" 
            + num.substring(0, 3) + ") " 
            + num.substring(3, 6) + "-" 
            + num.substring(6));
        
        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
