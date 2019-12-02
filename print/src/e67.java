import java.util.ArrayList;

public class e67 {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / list.size();

        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        double average = average(list);

        for (int num : list) {
            variance += Math.pow(num - average, 2);
        }

        variance /= (list.size() - 1);

        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}