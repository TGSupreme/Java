
/**
 * Oop_04_Bmi
 */
import java.util.Scanner;

public class Oop_04_Bmi {

    public static void main(String[] args) {
        // Body Mass Index (BMI) is a measure of health on weight. It can be calculated
        // by taking your weight in kilograms and dividing by the square of your height
        // in meters. Write a program that prompts the user to enter a weight in pounds
        // and height in inches and displays the BMI.
        // Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.

        Scanner sc = new Scanner(System.in);

        double weightp, heightin, bmi, weightkg, heightme;

        System.out.print("Enter Your Height (Inches) : ");
        heightin = sc.nextDouble();

        System.out.print("Enter Your Weight (Pounds) : ");
        weightp = sc.nextDouble();

        weightkg = (weightp * 0.45359237);
        heightme = (heightin * .0254);

        bmi = weightkg / (heightme * heightme);

        System.out.printf("\n\nYour Body Mass Index (BMI) : %.2f \n\n" , bmi);
        sc.close();
    }
}