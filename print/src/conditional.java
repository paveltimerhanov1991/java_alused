import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your number: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number > 0) {
            System.out.println("This number is positive: ");
    }
        System.out.print("Type your number again: ");
        int number1 = Integer.parseInt(reader.nextLine());

        if(number1 < 0) {
            System.out.println("Your number is negative: ");
        }
    }
}
