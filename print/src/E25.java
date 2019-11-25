import java.util.Scanner;

public class E25 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.print("type first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("type first second: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("type first third: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
