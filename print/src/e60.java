import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e60 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String input = reader.nextLine();

        while (!input.isEmpty()) {
            words.add(input);
            System.out.print("Type a word: ");
            input = reader.nextLine();
        }

        Collections.sort(words);

        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}