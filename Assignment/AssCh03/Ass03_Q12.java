import java.util.Scanner;

public class Ass03_Q12 {
    public static void main(String[] args) {
            // /Write a program which takes five numbers as command line argument from user, store
        // them in one dimensional array and display count of negative numbers.
        int size = 5;
        int a[] = new int[size];
        Scanner sc = new Scanner(System.in);
        Array ar = new Array();

        for(int i = 0;i < size; i++){
            System.out.print("Enter element ["+(i+1)+"] : ");
            a[i] = sc.nextInt();
        }
        int count = ar.countneg(a);

        System.out.println("Negative elements in A  = "+count);
        sc.close();
    }
}

class Array{
    public int countneg(int a[]){
        int count=0;
        for(int i = 0 ;i<a.length;i++){
            if(a[i]<0){
                count++;
            }
        }
        return count;
    }
}
