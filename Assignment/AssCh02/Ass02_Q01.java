public class Ass02_Q01 {
    public static void main(String[] args) {
        //Write a java program to print prime numbers upto 100.
        int flag;
        System.out.print("Prime Numbers < 100 : ");
        for (int i = 2; i < 101; i++){
            
            flag = 0;

            for(int j = 2; j < i; j++){
                if((i % j) == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print(i + " ");
            }
        }
    }
}
