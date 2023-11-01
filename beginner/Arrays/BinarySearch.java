package beginner.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int toSearch) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(toSearch == arr[mid]) {
                return mid;
            } else if(toSearch > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            int arr[] = {2, 4, 6, 7, 8, 10, 14, 15}; 

            System.out.println("Enter the number to search in the array");
            int n = sc.nextInt();

            if(binarySearch(arr, n) == -1) {
                System.out.println("Not found");
            } else {
                System.out.println("Found at index " + binarySearch(arr, n));
            }
        }
    }
}