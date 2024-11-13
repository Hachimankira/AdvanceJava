import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {
    public static void main(String[] args) {
        try {
            // Open a file in read-write mode ("rw")
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Writing data to the file at specific positions
            file.seek(0); // Move the pointer to the start of the file
            file.writeUTF("Hello, World!"); // Write a string
            
            file.seek(20); // Move the pointer to position 20
            file.writeInt(12345); // Write an integer
            
            file.seek(40); // Move the pointer to position 40
            file.writeDouble(3.14); // Write a double

            // Reading data from the file at specific positions
            file.seek(0); // Move the pointer to the start of the file
            String str = file.readUTF(); // Read the string
            System.out.println("String at position 0: " + str);
            
            file.seek(20); // Move the pointer to position 20
            int num = file.readInt(); // Read the integer
            System.out.println("Integer at position 20: " + num);
            
            file.seek(40); // Move the pointer to position 40
            double dbl = file.readDouble(); // Read the double
            System.out.println("Double at position 40: " + dbl);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
