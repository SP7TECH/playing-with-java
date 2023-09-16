package beginner.Loops;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to get the reverse of it");

            int n = sc.nextInt();

            while(n > 0) {
                int lastDigit = n % 10;
                System.out.print(lastDigit);
                n /= 10;
            }
            System.out.println();
        }
    }    
}
