import java.util.Scanner;

public class E30 {
    public static void main(String[]args) {
        Scanner reader = new Scanner(System.in);

        int limit, i;

        System.out.print("up to what number?");
        limit = Integer.parseInt(reader.nextLine());

        i = 1;

        while(i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}
