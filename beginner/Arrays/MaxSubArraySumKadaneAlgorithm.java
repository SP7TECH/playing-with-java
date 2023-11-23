package beginner.Arrays;

public class MaxSubArraySumKadaneAlgorithm {
    public static void maxSumKadane(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0) currentSum = 0;

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Max Sum = " + maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSumKadane(numbers);
    }
}