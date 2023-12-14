package beginner.Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            int minPosition = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }

            // swapping
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        if(arr.length == 0) System.out.println("Empty Array");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArr(arr);
    }
    
}
