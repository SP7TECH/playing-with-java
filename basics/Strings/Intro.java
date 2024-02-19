package basics.Strings;
import java.util.Scanner;

public class Intro {
    public static void printArray(char arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            char stringArray[] = {'T', 'o', 'n', 'y'};
            String name = "Tony";
            String lastName = new String("Stark");

            printArray(stringArray);
            System.out.println(name);
            System.out.println(lastName);

            // Input for Strings

            System.out.println("Enter a word: ");
            String word = sc.next();
            System.out.println(word);

            sc.nextLine();
            System.out.println("Enter a sentence: ");
            String sentence = sc.nextLine();
            System.out.println(sentence);
            System.out.println(sentence.length());
        }
    }
}
