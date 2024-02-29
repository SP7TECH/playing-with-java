package basics.Strings;
import java.util.Scanner;

public class ConvertLettersToUppercase {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");

            String str = sc.nextLine();
            System.out.println(str);
        }
    }
    
}
