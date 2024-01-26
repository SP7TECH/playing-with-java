package revision2024;
import java.util.Scanner;

public class Practice012 {
    public static void printArr(int arr[][], int rows, int cols) {
        System.out.println("Your 2D Array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();

            System.out.println("Enter the number of columns");
            int cols = sc.nextInt();

            int arr[][] = new int[rows][cols];

            System.out.println("Enter the array elements");
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            printArr(arr, rows, cols);
        }
    }
}
