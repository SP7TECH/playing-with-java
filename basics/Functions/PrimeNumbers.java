package basics.Functions;
import java.util.Scanner;

public class PrimeNumbers {
    public static boolean checkPrime(int n) {
        if(n == 2) return true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check whether it is prime or not: ");

            int n = sc.nextInt();
            
            if(checkPrime(n)) {
                System.out.println("Prime number");
            } else {
                System.out.println(" Not a prime number");
            }

        }
    }    
}
