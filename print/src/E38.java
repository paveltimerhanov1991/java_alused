import java.util.Scanner;

public class E38 {
    private static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void  main(String[]args) {
        Scanner reader = new Scanner(System.in);

        int count, i;

        System.out.println("How many?");
        count = Integer.parseInt(reader.nextLine());

        i = 0;
        while(i < count) {
            printText();
            i++;
        }
    }
}
