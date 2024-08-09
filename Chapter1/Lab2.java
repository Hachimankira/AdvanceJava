public class Lab2 {
    public static void main(String args[]){
        if (args.length < 2) {
            System.out.println("Please provide both name and age as arguments.");
            return;
        }
        
        String name = args[0];
        String age = args[1];
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
