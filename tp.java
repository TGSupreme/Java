import java.util.Random;

/**
 * tp
 */
public class tp {

    public static void main(String[] args) {
      
        Random rm = new Random();
        
        for(int i = 0 ; i< 10 ;i++){
            int a = rm.nextInt();
            System.out.println(a);
        }

       
        // acc ac = new acc("hjk",234);

        // System.out.println(ac.name);
        // System.out.println(ac.accno);
        // System.out.println(ac.balance);
    }
    
}


class acc{
    String name;
    long accno;
    double balance;

    acc(){
        name = "abc";
        accno = 123;
        balance = 300.34;
    }  
    
    acc(String a,long b,double c){
        name = a;
        accno = b;
        balance = c;
    }  

    acc(String a,long b){
        name = a;
        accno = b;
    }  


}