package revision2024;

public class Practice009 {
    public static void printSubArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int start = i;

            for(int j = i; j < arr.length; j++) {
                int end = j;
                
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int maxSubArraySumBruteForce(int arr[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int start = i;

            for(int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0; 

                for(int k = start; k <= end; k++) {
                    sum += arr[k];
                }

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static int maxSubArraySumPrefixArray(int arr[]) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        for(int i = 0; i < arr.length; i++) {
            int start = i;

            for(int j = i; j < arr.length; j++) {
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; 
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static int maxSubArraySumKadaneAlgorithm(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if(currentSum < 0) currentSum = 0;

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 15, 18};
        printSubArray(arr);

        System.out.println("Max sub array sum (Brute Force): " + maxSubArraySumBruteForce(arr));
        System.out.println("Max sub array sum (Prefix Array): " + maxSubArraySumPrefixArray(arr));
        System.out.println("Max sub array sum (Kadane's Algorithm): " + maxSubArraySumKadaneAlgorithm(arr));
    }
}