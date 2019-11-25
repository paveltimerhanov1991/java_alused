import java.util.Scanner;

public class E22 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String password = "carrot";

        String userPass;

        while(true) {
            System.out.print("Type the password: ");
            userPass = reader.nextLine();

            if(userPass.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: Blah!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
