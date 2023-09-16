package beginner.Loops;
import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check whether it is prime or not");

            int n = sc.nextInt();
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            
            if(isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}
