package beginner.Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        if(n == 0) return;

        for(int i = 1; i < n; i++) {
            int currentIndex = i;
            int prevIndex = i - 1;

            while(prevIndex >= 0 && arr[prevIndex] > arr[currentIndex]) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }

            arr[prevIndex + 1] = arr[currentIndex];
        }
    }

    public static void printArr(int arr[]) {
        if(arr.length == 0) System.out.println("Empty array");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
    
}
