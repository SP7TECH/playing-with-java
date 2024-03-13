package basics.BitWiseOperators;
import java.util.Scanner;

public class CheckForEvenOdd {
    public static void evenOdd(int n) {
        int bitMask = 1;

        if((n & bitMask) == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if it is even or odd: ");

            int n = sc.nextInt();
            evenOdd(n);
        }
    }
}
