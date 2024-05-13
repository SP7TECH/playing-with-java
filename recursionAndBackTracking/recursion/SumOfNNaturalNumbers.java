package recursionAndBackTracking.recursion;

public class SumOfNNaturalNumbers {
    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }
        
        int temp = printSum(n - 1);
        int sum = temp + n;
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(printSum(10));
    }
}
