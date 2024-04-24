/**
 * Ass02_Q11
 */
import java.util.Scanner;

public class Ass02_Q11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for miultiplication table : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
}