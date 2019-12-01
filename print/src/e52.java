import java.util.Scanner;

public class e52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        System.out.print("In reverse order: ");
        int i = name.length() - 1;
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
    }
}