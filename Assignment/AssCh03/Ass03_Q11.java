import java.util.Scanner;

public class Ass03_Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        
        fibonacci(n);
        sc.close();
    }

    static void fibonacci(int n){
        int a = 0,b=1, c = 0;
        System.out.print(a+ " " + b );
        for(int i = 0;i<(n-2);i++){
            c = a + b;
            System.out.print(" "+c );
            a=b;
            b = c;
        }
    }

}
