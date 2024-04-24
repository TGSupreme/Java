import java.util.Scanner;

public class Ass02_Q12 {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter two positive integers and finds
        //their greatest common divisor.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();

        int gcd = 0;

        for(int i = 2 ; (i < a || i < b); i++){
            if( (a % i == 0) && (b % i == 0)){
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " & " + b + " : "+gcd);
        
    }
}
