import java.util.Scanner;

public class e55 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String word1, word2;
        int index;

        System.out.print("Type the first word: ");
        word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        word2 = reader.nextLine();

        index = word1.indexOf(word2);

        if (index != -1) {
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'.");
        } else {
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'.");
        }
    }
}