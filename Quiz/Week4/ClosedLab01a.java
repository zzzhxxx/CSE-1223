import java.util.Scanner;

public class ClosedLab01a {

public static void main(String[] args)

{
    Scanner input = new Scanner(System.in);

    String usrname;

    String password;

    System.out.print("Enter username: ");

    usrname = input.nextLine();

    System.out.print("Enter password: ");

    password = input.nextLine();

    if (password.length()>8 && !usrname.equals(password)){

    System.out.print("User Created");

    } else {

    System.out.print("Weak Password");

    }

    input.close();

}
}