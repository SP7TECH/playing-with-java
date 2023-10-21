package beginner.AdvancedPatterns;
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void printPattern(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                if(count == 1) count = 0;
                else count = 1;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of stars to be printed");

            int n = sc.nextInt();
            printPattern(n);
        }        
    }
}