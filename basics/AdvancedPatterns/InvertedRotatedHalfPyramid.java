package basics.AdvancedPatterns;
import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void printPattern(int n) {
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for(int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows to be printed");

            int n = sc.nextInt();
            printPattern(n);
        }
    }
    
}
