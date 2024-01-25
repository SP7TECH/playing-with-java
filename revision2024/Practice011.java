package revision2024;

public class Practice011 {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        if(n == 0) return;

        for(int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    ++swaps;
                }

                if(j == 1 && swaps == 0) return;
            }
        }

        System.out.println("Bubble Sort");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        if(n == 0) return;

        for(int i = 0; i < n - 1; i++) {
            int minPosition = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }
            
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp; 
        }
        
        System.out.println("Selection Sort");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        selectionSort(arr);
    }
}