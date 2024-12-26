package TCP_socket_programming;

import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message;
            System.out.println("Type a message (type 'bye' to exit):");

            while (true) {
                System.out.print("You: ");
                message = consoleInput.readLine();
                output.println(message); // Send message to server

                if (message.equalsIgnoreCase("bye")) break;

                String serverResponse = input.readLine();
                System.out.println(serverResponse); // Print server's response
            }
            socket.close();

            System.out.println("Disconnected from the server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
