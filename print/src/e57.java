import java.util.ArrayList;
import java.util.Scanner;

public class e57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.print("Type a word: ");
        String inputString = reader.nextLine();

        while (!inputString.isEmpty()) {
            words.add(inputString);
            System.out.print("Type a word: ");
            inputString = reader.nextLine();
        }

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}