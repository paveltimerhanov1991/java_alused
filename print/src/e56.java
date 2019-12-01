import java.util.Scanner;

public class e56 {

    public static String reverse(String text) {
        String helper = "";
        int i = text.length() - 1;

        while (i >= 0) {
            helper += text.charAt(i);
            i--;
        }

        return helper;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}