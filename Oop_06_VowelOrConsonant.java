import java.util.Scanner;

public class Oop_06_VowelOrConsonant {

    public static void main(String[] args) {

        // Write a program that prompts the user to enter a letter and check whether a
        // letter is a vowel or consonant.

        Scanner sc = new Scanner(System.in);

        char a;

        System.out.print("Enter The Latter : ");
        a = sc.next().charAt(0);

        boolean vowel;

        vowel = (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U');
        
        if (vowel == true) {
            System.out.println("\nGiven Latter Is Vowel\n\n");
        } else {
            System.out.println("\nGiven Latter Is Consonant or Special Latter\n\n");
        }
        sc.close();

    }
}