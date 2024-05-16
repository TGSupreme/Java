
public class Ass03_Q05 {
    public static void main(String[] args) {
        // Write a JAVA program to display the following output using a 2-D array.
        // 0 1 2
        // 3 4 5
        // 6 7 8 9

        byte a[][] = { { 0 ,1, 2}, { 3, 4, 5 }, { 6, 7, 8 ,9} };

        //how this array is represented in memory
        //a is a ragged array
        // byte a[0] = new int [3];
        // byte a[1] = new int [3];
        // byte a[2] = new int [4];
        //|0 1 2|
        //|3 4 5|
        //|6 7 8 9|




      for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a[i].length); j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
