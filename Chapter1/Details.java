import java.util.Scanner;

public class Details{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); 
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        sc.close();
    }
}