import java.util.Scanner;

public class Oop_08_Factors {
       public static void main(String[] args) {
        //Write a program that reads an integer and displays all its smallest factors in increasing order. For
        //example if input number is 120, the output should be as follows:2,2,2,3,5.

        Scanner sc = new Scanner(System.in);
        
        System.out.print( "Enter The Number : ");
        int num = sc.nextInt();
        
        System.out.print("\n\nSmallest Factor Of " + num + ": ");
        // for(int i = 2; i <= num ; i++){
        //     for(int j = 0;j <= i ; j++){
        //         if(num % i == 0){
        //             num = num/i;
        //             System.out.print(i + " ");
        //         }
        //     }

        // }

        //second logic
        for(int i = 2; i <= num ; i++){
                if(num % i == 0){
                    num = num/i;
                    System.out.print(i + " ");
                    i--;
                }
            }

        }
        sc.close();
    }
}