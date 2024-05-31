import java.util.Random;
import java.util.Scanner;

public class Oop_13_Bank {
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.initialize();
        a1.display();
        a1.deposite();
        a1.withdraw();

    }
}

class Account{

    Scanner sc = new Scanner(System.in);
    Random rm  = new Random();
    
    String HolderName;
    long AccNo;
    double Balance;

    public void deposite(){
        System.out.print("\n\nEnter the amount to deposite: ");
        double amount = sc.nextDouble();

        Balance += amount;

        System.out.println("New Balance : "+Balance);
    }

    public void withdraw(){
        System.out.println("\n\nBalance : " + Balance);

        System.out.print("Enter amount to withdraw : ");
        double amount = sc.nextDouble();

        if(amount > Balance){
            System.out.println("Insufficient Balance!!!!");
        }
        else{

            Balance -= amount;

            System.out.println("New Balance : " + Balance);
        }

    }

    public void display(){
        System.out.println("\n\nAccount Holder Name : "+HolderName);
        System.out.println("Account Number : "+AccNo);
        System.out.println("Balance : "+Balance);

    }

    public void initialize(){
        System.out.print("\n\nEnter the name of account holder : ");
        HolderName = sc.nextLine();

        AccNo = rm.nextLong(999999999);

        System.out.print("Enter opening balance : ");
        Balance = sc.nextDouble();
    }
}
