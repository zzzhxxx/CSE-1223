/**
 * ENTER A DESCRIPTION OF YOUR PROJECT HERE!
 * @author Haixing Zhu
 * @version 20240827
 **/

 import java.util.Scanner;

 public class SimpleMath {
 
     public static void main(String[] args) {
         // TO DO: Enter your code here between the curly braces
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int num1= input.nextInt();
         System.out.print("Enter the second number: ");
         int num2 = input.nextInt();
         int sum = num1 + num2;
         int minus = num1 - num2;
         int product = num1 * num2;
         int devide = num1 / num2;
         int mode = num1 % num2;
         int average = (num1 + num2) / 2;
         System.out.printf("%d + %d = %d\n", num1, num2, sum);
         System.out.printf("%d - %d = %d\n", num1, num2, minus);
         System.out.printf("%d * %d = %d\n", num1, num2, product);
         System.out.printf("%d / %d = %d\n", num1, num2, devide);
         System.out.printf("%d %% %d = %d\n", num1, num2, mode);
         System.out.printf("The average of your two numbers is: %d\n", average);
     }
 }