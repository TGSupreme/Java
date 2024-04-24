import java.util.Random;

public class Oop_07_NumberPlate {
    public static void main(String[] args) {
        Random rm = new Random();
        //Assume a vehicle plate number consists of three uppercase letters followed by four digits. 
        //Write a program to generate a plate number.
        System.out.println("\n");

        for(int i= 1 ; i < 6; i++){
            
            char a = (char) ('A' + rm.nextInt(26));
            char b = (char) ('A' + rm.nextInt(26));
            char c = (char) ('A' + rm.nextInt(26));
    
            int num = rm.nextInt(9999);
    
            System.out.print("Random Number ["+ i +"] : ");
            System.out.println(a + "" + c + "" + b + " " + num );
        }
        System.out.println("\n\n");
    }
}
