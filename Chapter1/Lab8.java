/*print student table using multi dimensional table */
public class Lab8 {
    public static void main(String[] args) {
        String students[][] = { { "1", "John", "Smith" }, { "2", "Jane", "Doe" }, { "3", "Tom", "Brown" } };
        System.out.println("Student Table");
        System.out.println("ID\tFName\tLName");
        for (String[] student : students) {
            for (String data : student) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
