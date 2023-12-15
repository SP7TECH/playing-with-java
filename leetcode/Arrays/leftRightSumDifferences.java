package leetcode.Arrays;

public class leftRightSumDifferences {
    public static void leftRightDifference(int nums[]) {
        int leftSum[] = new int[nums.length];        
        int rightSum[] = new int[nums.length];
        int result[] = new int[nums.length];

        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                leftSum[i] += nums[j];
            }
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            for(int j = nums.length - 1; j > i; j--) {
                rightSum[i] += nums[j];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            int larger = Math.max(leftSum[i], rightSum[i]);
            int smaller = Math.min(leftSum[i], rightSum[i]);

            result[i] = larger - smaller;
        }
        printArr(result);
    }

    public static void printArr(int arr[]) {
        if(arr.length == 0) System.out.println("Empty array");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {10, 4, 8, 3};    
        leftRightDifference(nums);
    }
}
