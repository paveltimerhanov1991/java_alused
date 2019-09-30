import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your Name: ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int number = Integer.parseInt(reader.nextLine());   // Reads a line from the users keyboard

        System.out.print("Type your Name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int number2 = Integer.parseInt(reader.nextLine());

        int result = number + number2;
        System.out.println(name + " and " + name1 + " are " + result + " years in total");
    }
}
