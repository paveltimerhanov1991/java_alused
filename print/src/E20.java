import javax.swing.*;
import java.util.Scanner;

public class E20 {
    public static void  main(String []args){
        Scanner reader = new Scanner(System.in);

        String username, password;

        System.out.print("Enter username: ");
        username = reader.nextLine();
        System.out.print("Enter password: ");
        password = reader.nextLine();

        if((username.equals("x") && password.equals("mightydycks"))
            || (username.equals("emily") && password.equals("cat"))) {
            System.out.println("Logged in");
        } else {
            System.out.println("Not logged in");
        }
    }
}
