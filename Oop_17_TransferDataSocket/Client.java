import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket("localhost", 5000);

            // Create output stream to send data to server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send data to server
            output.println("Hello from client!");
            System.out.println("\nData sent to server.");

            // Close streams and socket
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
