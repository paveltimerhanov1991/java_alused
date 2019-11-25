import java.util.Scanner;

public class E31 {
    public static void main(String[]args) {
        Scanner reader = new Scanner(System.in);

        int first, last, i;

        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        last = Integer.parseInt(reader.nextLine());

        i = first;
        while(i <= last) {
            System.out.println(i);
            i++;
        }
    }
}
