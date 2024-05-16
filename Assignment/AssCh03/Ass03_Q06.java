import java.util.*;

public class Ass03_Q06 {
    public static void main(String[] args) {
        // Write a program that creates and initializes a four integer element array. Calculate and
        // display the average of its values.
        Scanner sc = new Scanner(System.in);
        int[] a;
        int sum = 0, size = 4;

        a = new int[size];

        double avg;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element [" + (i + 1) + "]: ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        avg = (double) sum / size;
        System.out.println("Average of these " + size + " elements is: " + avg);

    }
}