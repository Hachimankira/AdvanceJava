import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) >= 0) {
                vowels.append(ch);
            } else if (Character.isLetter(ch)) {
                consonants.append(ch);
            }
        }

        try (FileWriter vowelWriter = new FileWriter("vowel.txt");
             FileWriter consonantWriter = new FileWriter("consonant.txt")) {
            vowelWriter.write(vowels.toString());
            consonantWriter.write(consonants.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}