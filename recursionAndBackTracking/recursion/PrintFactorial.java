package recursionAndBackTracking.recursion;

public class PrintFactorial {
    public static int printFact(int n) {
        // base case
        if(n == 0) {
            return 1;
        }

        int fnm1 = printFact(n - 1);
        int fact = fnm1 * n;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(printFact(5));
    }
}
