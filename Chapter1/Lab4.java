import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = Float.parseFloat(sc.nextLine()); 
        System.out.println("Enter the second number: ");
        float b = Float.parseFloat(sc.nextLine());
        sc.close();

        if ( a == b ) {
            System.out.println("a is equal to b");
        } else if ( a > b ) {
            System.out.println("a is greater than b");
        } else if ( a < b ) {
            System.out.println("a is less than b");
        } else if (a <= b) {
            System.out.println("a is less than or equal to b");
        } else if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else if (a != b) {
            System.out.println("a is not equal to b");
        }
    }
}
