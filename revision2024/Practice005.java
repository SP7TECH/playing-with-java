package revision2024;
import java.util.Scanner;

public class Practice005 {
    
    public static int convertToBinary(int num) {
        int binary = 0;
        int pow = 0;

        while(num > 0) {
            int remainder = num % 2; 
            binary = binary + (remainder * (int)Math.pow(10, pow));
            pow++; 
            num /= 2;
        }

        return binary;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to get its binary equivalent: ");

            int num = sc.nextInt();
            System.out.println("Binary: " + convertToBinary(num));
        }
    }
}
