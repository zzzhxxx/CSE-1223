/**
 * DESCRIPTION OF PROGRAM HERE
 *
 * @author Haixing Zhu
 * @version 20240924
 */
import java.util.Scanner;

public class LuhnAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber = "";
        do{
            boolean valid = true;
            System.out.print("Enter a credit card number (enter a blank line to quit): ");
            cardNumber = scanner.nextLine();
            if(cardNumber.equals("")){
                break;
            }
            if(cardNumber.length()<16||cardNumber.length()>16){
                System.out.println("ERROR! Number MUST have exactly 16 digits.\n");
                valid = false;
            }
            if(valid){
            int sum = 0;
            for (int i=0;i<cardNumber.length()-1;i++){
                sum += Integer.parseInt(cardNumber.substring(i,i+1));
            }
            System.out.println("DEBUG: Sum is "+sum);
            System.out.println("Check digit is: "+cardNumber.substring(cardNumber.length()-1)+"\n");
            }
        }while(!cardNumber.equals(""));

        System.out.println("Goodbye!");
    }
}