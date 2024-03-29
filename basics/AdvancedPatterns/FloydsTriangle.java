package basics.AdvancedPatterns;
import java.util.Scanner;

public class FloydsTriangle {
    public static void printPattern(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
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
