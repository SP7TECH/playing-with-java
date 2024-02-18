package basics.AdvancedPatterns;
import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void printPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }   
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows to be printed");

            int rows = sc.nextInt();
            printPattern(rows);
        }
    }
    
}
