import java.util.Scanner;

public class Oop_03_Distance_Converter {
    // Write a program that reads a number in meters, converts it to feet, and
    // displays the result
    // 1 mt = 3.28084 ft
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float meter;
        double feet;

        System.out.print("Enter The Distance In Meter  : ");
        meter = sc.nextFloat();

        feet = 3.28084 * meter;

        System.out.print(meter + " Meters = " + feet + " Feet");
        sc.close();
    }
}