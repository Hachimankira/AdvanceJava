//using default values
// public class Lab3 {
//     //simple arthimetic operations
//     public static void main(String[] args) {
//         int a = 50;
//         int b = 10;
//         int sum = a + b;
//         int diff = a - b;
//         int mult = a * b;
//         int div = a / b;
//         int mod = a % b;
//         System.out.println("Sum: " + sum);
//         System.out.println("Difference: " + diff);
//         System.out.println("Multiplication: " + mult);
//         System.out.println("Division: " + div);
//         System.out.println("Modulus: " + mod);
//     }
// }

//using scanner class
import java.util.Scanner;

public class Lab3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = Float.parseFloat(sc.nextLine()); //scanner method to read input until the end of the line is reached
        System.out.println("Enter the second number: ");
        float b = Float.parseFloat(sc.nextLine()); //scanner method to read input until the end of the line is reached
        float sum = a + b;
        float diff = a - b;
        float mult = a * b;
        float div = a / b;
        float mod = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        sc.close();
    }
}
