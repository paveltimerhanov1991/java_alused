import java.util.Scanner;
public class greater {
    public static void  main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("Type first number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.print("Type second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        if(number > number2) {
            System.out.println("Greater");
        } else if (number < number2) {
            System.out.println("Lower");
        } else if (number == number2) {
            System.out.println("Equal");
        }
    }
}
