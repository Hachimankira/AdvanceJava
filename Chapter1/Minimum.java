public class Minimum {
    public static void main(String[] args){
        int[] numbers = {50,32,121,400, 95, 101};
        int minimum = numbers[0];
        for(int i=0;i<numbers.length; i++){
            if (numbers[i]<minimum){
                minimum=numbers[i];
                i++;
            }
        }   
        System.out.println("The minimum number from the array is " +minimum);
    }
}
