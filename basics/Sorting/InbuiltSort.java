package basics.Sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArr(Integer arr[]) {
        if(arr.length == 0) System.out.println("Empty Array");
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 0, 3);
        printArr(arr);

        Integer arr1[] = {7, 4, 1, 3, 5, 2, 6};
        Arrays.sort(arr1, Collections.reverseOrder());
        printArr(arr1);
    }
}
