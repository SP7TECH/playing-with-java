package beginner.Arrays;

public class MaxSubArraySumBruteForce {
    public static void printMaxArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;

                for(int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }

                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printMaxArraySum(arr);
    }
}