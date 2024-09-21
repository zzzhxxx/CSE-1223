/**
 * YOUR DESCRIPTION HERE
 * @author Haixing Zhu
 * @version 20240828
 */
import java.util.Scanner;

public class FunWithStringsIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Your name is " + name.length() + " letters long.");
        System.out.println("Your name starts with a " + name.charAt(0) + ".");
        System.out.println("The last three letters of your name are " + name.substring(name.length()-3) + ".");
        System.out.println("Goodbye!");
        input.close();
    }
}