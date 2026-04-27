import java.util.*;
import java.io.*;

public class TextIoDemo {
    public static void main(String[] args) throws IOException {
        
        // Create a new file named "TextIO.txt"
        File f1 = new File("TextIO.txt");
        f1.createNewFile();
        
        // Write text to the file
        FileWriter fw = new FileWriter("TextIO.txt");
        fw.write("Hello World \njava is one of the best programming languages..........");
        fw.close(); // It's important to close the file writer

        // Read text from the file
        FileReader fr = new FileReader("TextIO.txt");
        int i; // The .read() method returns a single integer, so we need a variable to store and print this integer as a character

        // Store the returned integer from read() into 'i' and print it in the loop
        // When the file content ends, read() returns -1
        while((i = fr.read()) != -1){
            System.out.print((char) i); // read() returns an integer, so we need to convert it to a character
        }
        fr.close();
    }
}
