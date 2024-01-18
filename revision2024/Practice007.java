package revision2024;
import java.util.Scanner;

public class Practice007 {
    public static void binarySearch(int arr[], int tofind) {
        System.out.println("Binary Search");
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(tofind == arr[mid]) {
                System.out.println(tofind + " found at " + mid);
                break;
            } else if(tofind > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }

    public static void linearSearch(int arr[], int tofind) {
        System.out.println("Linear Search");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == tofind) {
                System.out.println(tofind + " found at " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the array");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the array elements");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the array element to get the index");
            int tofind = sc.nextInt();

            linearSearch(arr, tofind);
            System.out.println();
            binarySearch(arr, tofind);
        }
    }
}
