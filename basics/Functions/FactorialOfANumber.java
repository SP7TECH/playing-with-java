package basics.Functions;
import java.util.Scanner;

public class FactorialOfANumber {

    public static int calcFactorial(int n) {
        int factorial = 1;
        while(n >= 1) {
            factorial *= n;
            n--;
        }

        return factorial;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter  a number to get its factorial");

            int n = sc.nextInt();
            int result = calcFactorial(n);

            System.out.println("Result: " + result);
        }
    }
    
}
