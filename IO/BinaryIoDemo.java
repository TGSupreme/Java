import java.util.*;
import java.io.*;

public class BinaryIoDemo {
    public static void main(String[] args) throws IOException{
        
        // Create a new file named "BinaryIO.txt"
        File f1 = new File("BinaryIO.txt");
        f1.createNewFile();

        // Write data to the file
        // FileOutputStream is used to send output from the program to the file
        FileOutputStream fo = new FileOutputStream("BinaryIO.txt");
        for(int i = 0; i < 10 ; i++){
            fo.write(i); // The write method of FileOutputStream only accepts single integers or characters, so we write one at a time
        }
        fo.close();

        // Read data from the file
        // FileInputStream is used to get input from the file into the program
        // We store the returned integer from read() into 'i' and print it in the loop
        // When the file content ends, read() returns -1
        FileInputStream fi = new FileInputStream("BinaryIO.txt");
        int i;
        while((i = fi.read()) != -1){
            System.out.print(i + " ");
        }
        fi.close();

        // If you try to open BinaryIO.txt, it will show some random binary values because we used binary I/O, so the data is stored in binary form
    }
}
