import java.util.Scanner;


public class e49 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");

        System.out.print("Last character: " + lastCharacter(reader.nextLine()));
    }

    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() - 1);

        return lastChar;
    }
}
