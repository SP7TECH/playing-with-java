package leetcode.Arrays;
import java.util.Arrays;

public class MissingNumbers {
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

    public static int missingNumbersThroughSearch(int[] nums) {
        int res = 0;

        for(int i = 1; i <= nums.length; i++) {
            if(binarySearch(nums, i) == -1) {
                res = i;
            }
        }

        return res;
    }

    public static int missingNumbers(int[] nums) {
        int sum = 0, numsSum = 0;

        for(int i = 1; i <= nums.length; i++) {
            sum += i;
        }

        for(int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }

        return sum - numsSum;
    }

    public static void main(String[] args) {
        int nums[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        
        // Approach One - Searching
        Arrays.sort(nums);
        System.out.println("res: " + missingNumbersThroughSearch(nums));

        // Approach Two - sum of n natural numbers
        System.out.println(missingNumbers(nums));

    }
}
