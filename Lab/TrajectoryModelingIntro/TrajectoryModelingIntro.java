/**
 * DESCRIPTION HERE
 * 
 * @author Haixing Zhu
 * @version 20241001
 **/
import java.util.Scanner;

public class TrajectoryModelingIntro {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter an initial speed: ");
		double v0 = input.nextDouble();
        System.out.print("\n");
		for(int i=0;i<=13;i++){
			double angle = 25.00 + i * 5.00;
			double distance =0.00;
			distance = (2*v0*Math.sin(Math.toRadians(angle))/9.8)*v0*Math.cos(Math.toRadians(angle));	
			System.out.printf("At angle %.2f projectile travels %.2f meters\n", angle, distance);
		}
	}

}