/**
 * DESCRIPTION OF PROGRAM HERE
 *
 * @author Haixing Zhu
 * @version 20240917
 */
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        int seed = in.nextInt();
        Random random = new Random(seed);
        int target = random.nextInt(200)+1;
        System.out.println("DEBUG: The number picked is: "+target);
        int guess = 0;
        int count = 0;
        do { 
            System.out.print("\n");
            System.out.print("Enter a guess between 1 and 200: ");
            guess = in.nextInt();
            count++;
            if (guess > 200 || guess < 1) {
                System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
            }
            if (guess != target){
                System.out.println("That is not the number.");
            }else{
                System.out.println("Congratulations!  Your guess was correct!");
                break;
            }
        } while (true);
        System.out.println("\nI had chosen " + target + " as the target number.");
        System.out.println("You guessed it in " + count + " tries.");
    }
}