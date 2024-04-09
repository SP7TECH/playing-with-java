package leetcode.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(target == arr[mid]) {
                return mid;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }
    
}
