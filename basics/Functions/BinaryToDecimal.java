package basics.Functions;
import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertToDecimal(int n) {
        int dec = 0; // additive identity
        int pow = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            dec += lastDigit * Math.pow(2, pow);
            pow++;
            n /= 10;
        }
        
        return dec;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a binary number to be converted to decimal");

            int n = sc.nextInt();
            System.out.println("Result: " + convertToDecimal(n));

        }
    }
    
}
