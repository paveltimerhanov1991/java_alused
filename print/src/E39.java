public class E39 {

    private static void  printStars(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print("*");
            i++;
        }

        System.out.println("");
    }

    private static void  printSquare(int sideSize) {
        int i = 0;

        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 0;

        while (i < height) {
            printStars(width);
            i++;
        }
    }

    private static void  printTriangle(int size) {
        int i = 0;

        while (i < size) {
            printStars(i + 1);
            i++;
        }
    }

    public static void main(String[]args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
