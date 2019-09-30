import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number >= 18) {
            System.out.println("You have reached the age of majority: ");
    }
        System.out.print("Type your age again: ");
        int number1 = Integer.parseInt(reader.nextLine());

        if(number1 <= 18) {
            System.out.println("You have not reached the age of majority: ");
        }
    }
}
