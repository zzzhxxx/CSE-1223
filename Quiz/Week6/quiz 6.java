import java.util.Scanner;

/**
   This program computes how many steps the sum 1 + 1/2 + 1/3 + ...
   needs to exceed a given target.
*/
public class test
{
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    // TODO: Your code below this line
    int correct = 0;
    while (true) { 
        int num1 = (int) (Math.random() * 51) + 50;
        int num2 = (int) (Math.random() * 51) + 50;
        System.out.printf("What is %d + %d? ", num1, num2);
        int userAnswer = input.nextInt();
        if (userAnswer == num1 + num2) {
            System.out.println("Correct!");
            correct++;
        } else {
            System.out.println("Wrong! The correct answer is " + (num1 + num2));
            break;
        }
    }
    System.out.println("Quiz Over. You answered " + correct + " questions correctly.");
    input.close();
}}
