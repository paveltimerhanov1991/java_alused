public class E44 {
    public static int least(int number1, int number2) {

        int min;

        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }

        return min;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
