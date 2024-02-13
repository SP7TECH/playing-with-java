package revision2024;
import java.util.Scanner;

public class Practice013 {
    public static void checkPrime(int n) {
        boolean isPrime = true;

        if(n % 2 == 0) isPrime = false;

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    public static void printButterfly(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            for(int k = 1; k <= (n - i) * 2; k++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            for(int k = 1; k <= (n - i) * 2; k++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    public static void uniquePairs(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

    public static int binarySearch(int arr[], int elementToSearch) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(elementToSearch == arr[mid]) {
                return mid;
            } else if(elementToSearch > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                // check the numbers
                if(arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }

    public static int[] selectionSort(int arr[]) {
        int n = arr.length - 1;

        for(int i = 0; i < n; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // swapping outside of the nested loop
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] insertionSort(int arr[]) {
        int n = arr.length;
        
        for(int i = 1; i < n; i++) {
            int currentElement = arr[i];
            int prevIndex = i - 1;

            while(prevIndex >= 0 && arr[prevIndex] > currentElement) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = currentElement;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            
            int n = sc.nextInt();
            checkPrime(n);
            printButterfly(n);

            int arr[] = {4, 5, 6, 7, 8, 9};
            uniquePairs(arr);

            System.out.println("Enter an element to search in the array");
            int elementToSearch = sc.nextInt();
            System.out.println("Element found at index: " + binarySearch(arr, elementToSearch));

            int arr2[] = {5, 4, 1, 3, 2};
            System.out.print("Bubble Sort ------> ");
            printArray(bubbleSort(arr2));
            
            System.out.print("Selection Sort ------> ");
            printArray(bubbleSort(arr2));

            System.out.print("Insertion Sort ------> ");
            printArray(insertionSort(arr2));
        }
    }
}
