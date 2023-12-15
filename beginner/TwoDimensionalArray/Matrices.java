package beginner.TwoDimensionalArray;
import java.util.Scanner;

public class Matrices {
    public static void search(int arr[][], int elementToSearch) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == elementToSearch) {
                    System.out.println("Element found at index (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and cols: ");

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            System.out.println("Enter " + (rows * cols) + " array elements");

            int arr[][] = new int[rows][cols];

            // input
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            // output
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Enter an element two search: ");
            int elementToSearch = sc.nextInt();
            search(arr, elementToSearch);
        }
    }
}
