import java.util.Scanner;

public class E35 {
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        int power, sum;

        System.out.print("Type is a number: ");
        power = Integer.parseInt(reader.nextLine());

        int i = 0;
        sum = 0;
        while (i <= power) {
            sum += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + sum);
    }
}
