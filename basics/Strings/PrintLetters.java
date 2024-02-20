package basics.Strings;
import java.util.Scanner;

public class PrintLetters {
    public static void printLetters(String sentence) {
        for(int i = 0; i < sentence.length(); i++) {
            System.out.print(sentence.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a sentence to print its letters: ");

            String sentence = sc.nextLine();
            printLetters(sentence);
       }
    }
}
