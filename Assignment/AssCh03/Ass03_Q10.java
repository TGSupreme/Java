import java.util.Scanner;

public class Ass03_Q10 {
    public static void main(String[] args) {

        // Define a recursive method for computing x raised to power y by doing
        // repetitive
        // multiplication where x and y are positive integer numbers. Define main to use
        // above
        // method.
        Scanner sc = new Scanner(System.in);
        Ass03_Q10 obj = new Ass03_Q10();
        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        
        int result = obj.power(x,y);

        System.out.println(x+" ^ "+y+" = "+result);
    }

    int power(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * power(x, (y - 1));
        }
    }
}
