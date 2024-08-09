public class Lab6 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for(int i:arr)
            System.out.println(i);
        System.out.println("Length of the array: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
