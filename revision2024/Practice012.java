package revision2024;
import java.util.Scanner;

public class Practice012 {
    public static void printArr(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Your 2D Array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchInArray(int arr[][], int toSearch) {
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] == toSearch) {
                    System.out.println("Element found at index (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void diagonalSum(int arr[][]) {
        int sum = 0;
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows != cols) {
            System.out.println("A square matrix needed");
            return;
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Diagonal Sum: " + sum);
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

            printArr(arr);

            System.out.println("Enter an element to search in the array");
            int toSearch = sc.nextInt();
            searchInArray(arr, toSearch);

            diagonalSum(arr);
        }
    }
}
