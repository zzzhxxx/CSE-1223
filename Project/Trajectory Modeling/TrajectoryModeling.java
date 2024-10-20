/**
 * This program models the trajectory of a projectile based on varying angles and initial velocities,
 * attempting to find the combination that lands closest to a target at a given distance.
 *
 * @author Haixing Zhu
 * @version 20241005
 **/

 import java.util.Scanner;

 public class TrajectoryModeling {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         // Prompt the user to enter the target distance.
         System.out.print("Enter a distance to target: ");
         double d0 = input.nextDouble();  // Target distance entered by the user.
         
         double bestDistance = d0;  // Initialize the best distance (difference from the target).
         double finalDistance = 0.00;  // Variable to store the best distance traveled.
         double finalAngle = 0.00;  // Variable to store the best angle found.
         double finalSpeed = 0.00;  // Variable to store the best initial speed found.
 
         // Loop through 14 different angles, incrementing by 5 degrees starting at 25 degrees.
         for (int i = 0; i <= 13; i++) {
             // Loop through 30 different initial speeds (1 to 30 m/s).
             for (int j = 1; j <= 30; j++) {
 
                 // Calculate the current velocity in meters per second.
                 double v0 = j * 1.00;
 
                 // Calculate the current angle in degrees.
                 double angle = 25.00 + i * 5.00;
 
                 // Calculate the distance traveled by the projectile using kinematic equations.
                 // The formula considers both vertical and horizontal components of the motion.
                 double distance = (2 * v0 * Math.sin(Math.toRadians(angle)) / 9.8) * v0 * Math.cos(Math.toRadians(angle));
 
                 // If the current distance is closer to the target than the previous best but still doesn't overshoot the target.
                 if (d0 - distance < bestDistance && d0 - distance > 0) {
                     bestDistance = d0 - distance;  // Update the best distance missed from the target.
                     finalDistance = distance;  // Update the best distance traveled.
                     finalAngle = angle;  // Update the best angle.
                     finalSpeed = v0;  // Update the best initial speed.
                 }
             }
         }
 
         // Output the best angle, speed, distance traveled, and how far off from the target.
         System.out.printf("\nBest angle: %.2f\n", finalAngle);
         System.out.printf("Best speed: %.2f\n", finalSpeed);
         System.out.printf("Distance travelled: %.2f\n", finalDistance);
         System.out.printf("Missed the target center by: %.2f\n", bestDistance);
     }
 }
 