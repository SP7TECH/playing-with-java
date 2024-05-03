package leetcode.Arrays;

public class MaxSubArraySum {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++) {
            int start = i;

            for(int j = i; j < nums.length; j++) {
                int end = j;
                currentSum = 0;

                for(int k = start; k <=end; k++) {
                    currentSum += nums[k];
                }
            }

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
