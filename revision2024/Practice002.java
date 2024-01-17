package revision2024;
import java.util.Scanner;

public class Practice002 {
    private static boolean isPrime = true;
    
    public static boolean checkPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) isPrime = false;
        }
        
        return isPrime;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");

            int num = sc.nextInt();
            checkPrime(num);
            if(isPrime) 
                System.out.println("Prime Number");
            else
                System.out.println("Not a prime number"); 
        }
    }
}
