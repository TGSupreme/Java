public class Ass02_Q02 {
    public static void main(String[] args) {
        //Write a JAVA program to implement the Fibonacci series using for loop control structure.
        int a = 0;
        int b = 1;
        int next = 0;
        System.out.print(a + " " + b + " ");

        for(int i = 0; i < 15; i++){
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }


    }
}
