import java.util.Scanner;

/**
 * Ass03_Q04
 */
public class Ass03_Q04 {

    // Write a problem to read 100 numbers, get the average of these numbers, and
    // find the
    // number of the items greater than the average.
    public static void main(String[] args) {
        int a[], sum = 0, count = 0, size = 100;

        a = new int[size];
        Scanner sc = new Scanner(System.in);

        double avg;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element [" + (i + 1) + "]: ");
            a[i] = sc.nextInt();

            sum += a[i];
        }
        avg = (double) sum / size;

        for (int i = 0; i < size; i++) {

            if (a[i] > avg) {
                count++;
            }
        }

        System.out.println("Average of these " + size + "elements is: " + avg);
        System.out.println("Number of elements > " + avg + ": " + count);
    }
}