package basics.AdvancedPatterns;
import java.util.Scanner;

public class ButterflyPattern {
    
    public static void printButterfly(int n) {
        for(int i = 1; i <= n; i++) {
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //spaces
            for(int k = 1; k <= (2 * (n - i)); k++) {
                System.out.print("  ");
            }

            //stars
            for(int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // mirror
        for(int i = n; i >= 1; i--) {
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //spaces
            for(int k = 1; k <= (2 * (n - i)); k++) {
                System.out.print("  ");
            }

            //stars
            for(int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of lines you want to print");

            int n = sc.nextInt();
            printButterfly(n);
        }
    }
}
