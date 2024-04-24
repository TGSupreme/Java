public class tp {
    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series Upto " + n + ": ");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
