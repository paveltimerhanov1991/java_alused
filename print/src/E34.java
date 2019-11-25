import java.util.Scanner;

public class E34 {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);

        int inputNum, factorial, i;

        i = 1;
        factorial = 1;

        System.out.print("Type a number: ");
        inputNum = Integer.parseInt(reader.nextLine());

        while(i <= inputNum) {
            factorial *= i;
            i++;
        }

        if (inputNum == 0) {
            factorial = 1;
        }

        System.out.println("Factorial is " +  factorial);
    }
}
