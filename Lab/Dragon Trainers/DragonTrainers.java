
/**
 * YOUR DESCRIPTION OF THIS PROGRAM HERE
 * @author YOUR NAME HERE
 * @version DATE HERE
 */
import java.util.Scanner;

public class DragonTrainers {

    /**
     * Prompts the user with the message: "How many matches will we play? " and
     * takes in an integer as input. If the user enters a value that is 0 or
     * negative, displays the error message: "ERROR - number of matches must
     * be positive!" and asks again. Continues looping until the user enters a
     * positive number.
     *
     * @param input
     *              - Scanner to read values from the keyboard
     * @return - an integer value strictly larger than zero.
     */
    public static int getNumberOfMatches(Scanner input) {
        int matches = 0;
        while (true) {
            System.out.print("How many matches will we play? ");
            if (input.hasNextInt()) {
                matches = input.nextInt();
                input.nextLine();
                if (matches > 0) {
                    break;
                } else {
                    System.out.println("ERROR - number of matches must be positive!");
                }
            } else {
                System.out.println("ERROR - please enter a valid number!");
                input.nextLine();
            }
        }
        return matches;
    }

    /**
     * Prompts the user with the message "Please select a dragon
     * [Plant/Water/Fire]: " and waits for user input. If the user enters a
     * blank line, prints the error message "ERROR - Dragon prompt cannot be
     * empty" and asks the user again. Repeats until the user enters a non-blank
     * line.
     *
     * @param input
     *              - Scanner to read values from the keyboard
     * @return A non-empty String entered by the user
     */
    public static String promptForDragon(Scanner input) {
        String dragon;
        while (true) {
            System.out.print("Please select a dragon [Plant/Water/Fire]: ");
            dragon = input.nextLine().trim();
            if (!dragon.isEmpty()) {
                break;
            } else {
                System.out.println("ERROR - Dragon prompt cannot be empty.");
            }
        }
        return dragon;
    }

    /**
     * NOTE: The main method has been completed for you. If you correctly
     * complete the methods above, the main method will "just work" and produce
     * the correct output.
     */
    public static void main(String[] args) {
        // Prompt for a random number seed
        Scanner keyboard = new Scanner(System.in);
        // Prompt for number of matches to play
        int totalMatches = getNumberOfMatches(keyboard);
        // DEBUG message - how many matches did we get back?
        System.out.println("DEBUG: total matches entered " + totalMatches);
        // Create a counter to prompt for dragons as many times as
        // the user has asked for matches.
        int counter = 0;
        while (counter < totalMatches) {
            // Ask the user for a dragon to use
            String input = promptForDragon(keyboard);
            // DEBUG message - what got entered by the user?
            System.out.println("DEBUG: user entered " + input);
            System.out.println();

            // Don't forget to increment our counter!
            counter = counter + 1;
        }
        // Don't forget to close the Scanner!
        keyboard.close();
    }

}