package beginner.Functions;
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers to multiply them");

            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = multiply(a, b);
            System.out.println("Result: " + result);
        }    
    }
}
