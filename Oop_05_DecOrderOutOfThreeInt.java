import java.util.Scanner;

public class Oop_05_DecOrderOutOfThreeInt {
        public static void main(String[] args) {

        // Write a program that prompts the user to enter three integers and display the
        // integers in decreasing order.

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter The Value Of A : ");
        a = sc.nextInt();

        System.out.print("Enter The Value Of B : ");
        b = sc.nextInt();

        int temp;

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.print("Enter The Value Of C : ");
        c = sc.nextInt();

        if (c > b) 
        {
            if (c > a) 
            {
                temp = b;
                b = a;
                a = c;
                c = temp;
            }
            else 
            {
                temp = c;
                c = b;
                b = temp;
            }

        }
        System.out.println("\nDecreasing Order : " + a + " , " + b + " , " + c + "\n\n");

        sc.close();

    }
}