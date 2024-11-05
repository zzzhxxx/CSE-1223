import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FunWithFiles {

   /**
    * Displays the file given by fname to the screen
    * 
    * @param fname file to be displayed
    */
   public static void displayFile(String fname) {
        try {
            File file = new File(fname);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.print(scanner.nextLine().stripTrailing());
                if (scanner.hasNextLine()) {
                    System.out.print("\n");
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR - File " + fname + " not found!");
        }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fname = scanner.nextLine();
        displayFile(fname);
        scanner.close();
    }
}
