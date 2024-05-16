import java.util.Scanner;

public class Ass03_Q01 {
    public static void main(String[] args) {
        //Create a two dimensional array named 'marks' and initialize it.
        int size = 10;
        
        int marks[][] = new int[size][2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < size;i++){
                System.out.print("ENter Roll no. for ["+i+"] : ");
                marks[i][0] = sc.nextInt();
                System.out.print("ENter Marks for Roll no.["+marks[i][0]+"] : ");
                marks[i][1] = sc.nextInt();
        }


}
}