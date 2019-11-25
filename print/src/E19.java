import java.util.Scanner;

public class E19 {
    public static void  main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 0 && age <= 100) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
