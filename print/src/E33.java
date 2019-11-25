import java.util.Scanner;

public class E33 {
    public static void  main(String[]args){
        Scanner reader = new Scanner(System.in);

        int lowerLimit, upperLimit, sum, i;

        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());

        sum = 0;
        i = lowerLimit;

        while (i <= upperLimit) {
            sum += i;
            i++;
        }

        System.out.println("Sum is " + sum);
    }
}
