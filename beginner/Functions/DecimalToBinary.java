package beginner.Functions;
import java.util.Scanner;

public class DecimalToBinary {

    public static int convertToBinary(int n) {
        int binary = 0;
        int pow = 0;
        
        while(n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a decimal to obtain it's binary");

            int n = sc.nextInt();
            System.out.println("Result: " + convertToBinary(n));
        }
    }
}
