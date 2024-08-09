import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the second number: ");
        float b = Float.parseFloat(sc.nextLine());
        sc.close();

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        }

        // Additional logical operations
        if (a != b) {
            System.out.println("a is not equal to b");
        }

        System.out.println(a > 0 && b > 0 ? "Both a and b are positive numbers"
                : "At least one of a or b is not a positive number");

        System.out.println(a < 0 || b < 0 ? "At least one of a or b is a negative number"
                : "Neither a nor b is a negative number");

        System.out.println(
                !(a == b) ? "a is not equal to b (using NOT operator)" : "a is equal to b (using NOT operator)");
    }
}