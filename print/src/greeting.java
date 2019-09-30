import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type number: ");
        int number = Integer.parseInt(reader.nextLine());   // Reads a line from the users keyboard

        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        System.out.println("Sum of the numbers: "  + (number + number2));
    }
}
