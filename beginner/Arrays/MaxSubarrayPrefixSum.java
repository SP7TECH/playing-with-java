package beginner.Arrays;

public class MaxSubarrayPrefixSum {
    public static void prefixSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[numbers.length];

        // first element for prefix
        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        prefixSum(numbers);
    }
}
