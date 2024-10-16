import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums =0;
        List<String> movies = new ArrayList<String>();
        List<Double> ratings = new ArrayList<Double>();
        System.out.print("Enter number of movies: ");
        nums = input.nextInt(); 
        
        for(int i=0;i<nums;i++){
            input.nextLine();
            System.out.print("Enter title of movie "+(i+1)+": ");
            movies.add(input.nextLine());
            System.out.print("Enter rating for "+movies.get(i)+": ");
            ratings.add(input.nextDouble());
            
        }
        //Ask user to input movies and ratings
        System.out.println("All Movies and Ratings:");
        for(int i=0;i<nums;i++){
            System.out.println(movies.get(i)+": "+ratings.get(i));
        }

        //Print all movies and ratings
        double maxRatings = Collections.max(ratings);
        double minRatings = Collections.min(ratings);
        System.out.print("\nHighest-rated Movie: "+movies.get(ratings.indexOf(maxRatings))+" with rating "+maxRatings);
        // Find and print highest and lowest rated movies
        

        input.close();
    }
}