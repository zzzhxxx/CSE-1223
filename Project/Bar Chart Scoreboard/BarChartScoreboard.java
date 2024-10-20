/**
 * This program generates a bar chart-based scoreboard for a set of players.
 *
 * @author Haixing Zhu
 * @version 20241019
 */

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Scanner;
 
 public class BarChartScoreboard {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int playerNum = 0;  // Variable to store the number of players.
 
         // Prompt the user to enter the number of players.
         System.out.print("Enter the number of players: ");
         playerNum = input.nextInt();
 
         // If no players are entered, exit the program.
         if (playerNum == 0) {
             System.out.println("No players to display?  Goodbye!");
             System.exit(0);  // Exit the program if no players are available.
         }
 
         // Initialize ArrayLists to store player names and their corresponding scores.
         ArrayList<String> names = new ArrayList<String>();
         ArrayList<Integer> scores = new ArrayList<Integer>();
 
         // Collect names and scores for each player.
         for (int i = 0; i < playerNum; i++) {
             input.nextLine();  // Consume newline character left over from nextInt().
             
             // Prompt user to enter player name.
             System.out.print("Enter a player name: ");
             names.add(input.nextLine());  // Add the player's name to the names list.
             
             // Prompt user to enter the score for the current player.
             System.out.println("Enter the score for " + names.get(i) + ": ");
             scores.add(input.nextInt());  // Add the player's score to the scores list.
         }
 
         // Print the header for the scoreboard.
         System.out.println("Current Scoreboard\n------------------");
 
         // Find the highest score in the list to scale the bar chart.
         int maxScore = Collections.max(scores);
 
         // Find the length of the longest name to ensure proper alignment.
         int maxLen = 0;
         for (int i = 0; i < playerNum; i++) {
             if (names.get(i).length() > maxLen) {
                 maxLen = names.get(i).length();  // Update maxLen if a longer name is found.
             }
         }
 
         // Add spaces to the names to make them all align based on the longest name.
         for (int i = 0; i < playerNum; i++) {
             int space = maxLen - names.get(i).length();  // Calculate the number of spaces needed.
             
             // Append spaces to the name until it matches the length of the longest name.
             for (int j = 0; j <= space; j++) {
                 names.set(i, names.get(i) + " ");
             }
         }
 
         // Display each player's name followed by a bar of asterisks representing their score.
         for (int i = 0; i < playerNum; i++) {
             System.out.print(names.get(i));  // Print the player's name.
 
             // Scale the number of asterisks according to the score and the highest score.
             if (scores.get(i) != 0) {
                 for (int j = 0; j < (scores.get(i) * 50) / maxScore; j++) {
                     System.out.print("*");  // Print asterisks for the player's score.
                 }
             }
             System.out.println();  // Move to the next line after printing the player's bar.
         }
     }
 }
 