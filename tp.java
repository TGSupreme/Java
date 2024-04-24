import java.util.*;

public class tp {

    public static void main(String[] args) {

        int a[][] = new int[6][6];

        Random rm = new Random();

        for (byte i = 0; i < 6 ; i++){
            for(byte j = 0 ; j < 6; j++){
                a[i][j] = rm.nextInt(2);
            }
        }
        
        for (byte i = 0; i < 6 ; i++){
            System.out.print("| ");
            for(byte j = 0 ; j < 6; j++){
                System.out.print(a[i][j] + "   ");
                // a[i][j] = rm.nextBytes(1);
            }
            System.out.println("|");
        }

        
    }

}