package leetcode.Arrays;

public class SortingArray {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArray1(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            int minPosition = i;

            for(int j = i + 1; j < n; j++) {
                if(nums[j] < nums[minPosition]) {
                    minPosition = j;
                }
            }

            // Swapping
            int temp = nums[i];
            nums[i] = nums[minPosition];
            nums[minPosition] = temp;
        }

        return nums;
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        
        for(int i = 1; i < n; i++) {
            int current = nums[i];
            int previous = i - 1;

            while (previous >= 0 && nums[previous] > current) {
                nums[previous + 1] = nums[previous];
                previous--;
            }

            nums[previous + 1] = current;
        }

        return nums;
    }
    
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        printArr(sortArray(nums));
    }
}
