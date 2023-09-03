package beginner.Intro;
import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String args[]) {

        System.out.println("Enter a number to check if it is prime or not");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a prime number");
    }
}
