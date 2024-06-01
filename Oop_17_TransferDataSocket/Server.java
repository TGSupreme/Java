import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("\nServer waiting for client connection...");

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input stream to receive data from client
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Read data from client
            String inputData = input.readLine();
            System.out.println("Data received from client: " + inputData);

            // Close streams and sockets
            input.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
