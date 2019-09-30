import java.util.Scanner;
public class greeting
{
    public static void main(String[] args)
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Type the radius:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Circumference of the circle: "+area);
    }
}
