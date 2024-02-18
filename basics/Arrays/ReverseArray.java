package basics.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;

        while(start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // updating the indexes
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8, 9};
        reverseArray(arr);

        // Printing the loop
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
