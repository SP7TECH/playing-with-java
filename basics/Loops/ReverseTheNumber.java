package basics.Loops;
import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to obtain its reverse");

            int n = sc.nextInt();
            int rev = 0;
            while(n > 0) {
                int lastDigit = n % 10;
                rev = (rev * 10) + lastDigit;
                n /= 10;
            }

            System.out.println(rev);
        }
    }    
}
