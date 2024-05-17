package recursionAndBackTracking.recursion;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        // Base Case
        if(n == 0 || n == 1) {
            return n;
        }

        int fibNM1 = fibonacci(n - 1);
        int fibNM2 = fibonacci(n - 2);
        int fibN = fibNM1 + fibNM2;

        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
