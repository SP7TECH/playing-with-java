package beginner.Functions;
import java.util.Scanner;

public class PrimesInRange {
    public static boolean isPrime(int n) {
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
            System.out.println("Enter a number to get prime numbers that exist in the range");

            int n = sc.nextInt();
            for(int i = 2; i <= n; i++) {
                isPrime(i);

                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

}
