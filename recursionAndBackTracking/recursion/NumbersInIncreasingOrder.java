package recursionAndBackTracking.recursion;

public class NumbersInIncreasingOrder {
    public static void printNumbers(int n) {
        // Base Case
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}