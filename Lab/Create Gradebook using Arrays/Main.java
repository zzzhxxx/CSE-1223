import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of classes you have: ");
        int times = input.nextInt();    
        String[] classes = new String[times];
        String[] grades = new String[times];
        int[] credits = new int[times];
        for(int i=0;i<times;i++){
            System.out.print("Please enter the class "+(i+1)+" name: ");
            classes[i] = input.next();
            System.out.print("Please enter the class "+(i+1)+" grade: ");
            grades[i] = input.next();
            System.out.print("Please enter the class "+(i+1)+" credit hours: ");
            credits[i] = input.nextInt();
        }
        System.out.println("\nClass\tGrade\tCredit");
        for(int i=0;i<times;i++){
            System.out.println(classes[i]+"\t"+grades[i]+"\t"+credits[i]);
        }
        System.out.println();
    }

}