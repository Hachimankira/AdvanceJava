package TCP_socket_programming;
import java.io.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            
            Socket socket = serverSocket.accept(); // Wait for a client to connect

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
                output.println("Server: " + message); // Echo the message back
                if (message.equalsIgnoreCase("bye")) break;
            }
            serverSocket.close();
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

