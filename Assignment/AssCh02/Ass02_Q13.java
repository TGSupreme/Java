import java.util.Scanner;

public class Ass02_Q13 {
    public static void main(String[] args) {
        // Write a program that prompts the user to enter a three-digit integer and
        // determines whether it is a palindrome number. A number is palindrome if it
        // reads the same from right to left and from left to right.

        
        int num, numrev;

        Ass02_Q13 re = new Ass02_Q13();

        System.out.print("Enter value of A : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        numrev = re.reverseNum(num);

        if (num == numrev) {
            System.out.println(num + " is a palindrome number.");
        }

    }

    int reverseNum(int a) {
        int rev = 0;

        for (int i = 0; a != 0; i++) {
            rev = (rev * 10) + (a % 10);
            a /= 10;
        }
        return rev;
    }
}
