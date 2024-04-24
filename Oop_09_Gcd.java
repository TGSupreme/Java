import java.util.Scanner;

public class Oop_09_Gcd {
    public static void main(String[] args) {
        int a, b, gcd;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value Of A : ");
        a = sc.nextInt();
        
        
        System.out.print("Enter Value Of B : ");
        b = sc.nextInt();

        gcd = gcd(a,b);

        System.out.println("GCD Of "+a+" And "+b+ ": "+gcd);
    }  
      
    public static int gcd (int num1, int num2){
        int gcd=1;
        for(int i = 1; i <= num1 || i <= num2 ; i++){
            if(num1 % i == 0 && num2 % i ==0){
                gcd = i;
            }

        }
        return gcd;
    }
}
