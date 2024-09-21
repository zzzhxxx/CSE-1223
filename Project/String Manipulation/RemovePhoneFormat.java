/**
 * Remove phone format
 * This program removes formatting characters
 * @author Haixing Zhu
 * @version 20240906
 */
import java.util.Scanner;

public class RemovePhoneFormat {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a phone number with formatting characters
        System.out.print("Enter a phone number: ");
        
        // Read the input phone number as a string
        String phone = input.nextLine();

        // Remove various formatting characters from the phone number
        phone = phone.replace("(", ""); // Remove '('
        phone = phone.replace(")", ""); // Remove ')'
        phone = phone.replace("-", ""); // Remove '-'
        phone = phone.replace(" ", ""); // Remove spaces
        phone = phone.replace("+", ""); // Remove '+'
        
        // Output the cleaned phone number
        System.out.print("Your phone number is: " + phone); 
        
        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
