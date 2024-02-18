package beginner.TwoDimensionalArray;
import java.util.Scanner;

public class StaircaseSearch {

    public static boolean staircaseSearch(int arr[][], int elementToSearch) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if(arr[row][col] == elementToSearch) {
                System.out.println("Element found at index (" + row + "," + col + ")");
                return true;
            } else if(elementToSearch < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
            };
    
            System.out.println("Enter an element to search in the matrix: ");
            int elementToSearch = sc.nextInt();
            staircaseSearch(arr, elementToSearch);
        }
    }
    
}
