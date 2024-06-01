import java.util.Scanner;

public class Oop_15_ExceptionHandling01 {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        byte age = sc.nextByte();
        try {
            checkAge(age);
        } catch (MyException ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
        }
    }
}

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}