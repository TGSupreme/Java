import java.util.Scanner;

public class tp {

    public static void main(String[] args) {
    int n ;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();


    int a [][] = new int [n][n];

    
    for(int i = 0;i<n;i++){
        for (int j = 0;j<n;j++){
            a[i][j]=sc.nextInt();
        
        }
        
       
    }






    for ( int i=0 ; i <n ; i ++){
        for(int j =0 ;j<n;j++){

            System.out.print(a[i][j]+ " " );
        }
        System.out.println();
    }
    
    
    
    
    }
         
        
         
        
    }

    // int add (int x, int y)
    

