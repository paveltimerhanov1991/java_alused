import java.util.Scanner;

public class E32 {
    public static void main(String[]args) {
        Scanner reader = new Scanner(System.in);

        int limit, sum, i;

        sum = 0;
        i = 1;

        System.out.print("Until what? ");
        limit = Integer.parseInt(reader.nextLine());

        while(i <= limit) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
