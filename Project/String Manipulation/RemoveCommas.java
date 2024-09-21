/**
 * Remove commas from a number
 * This program removes all commas from a given number string.
 * @author Haixing Zhu
 * @version 20240906
 */
import java.util.Scanner;

public class RemoveCommas {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number with commas
        System.out.print("Enter a number: ");
        
        // Read the input as a string
        String num = input.nextLine();
        
        // The replace method replaces all commas with an empty string
        System.out.println("Your number is: " + num.replace(",", ""));
        
        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
