package beginner.AdvancedPatterns;
import java.util.Scanner;

public class HollowRectangle {
    
    public static void hollowRectangle(int rows, int cols) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and cols to be printed ");

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            hollowRectangle(rows, cols);
        }

    }
}
