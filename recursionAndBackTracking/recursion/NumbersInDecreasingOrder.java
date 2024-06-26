package recursionAndBackTracking.recursion;

public class NumbersInDecreasingOrder {
    public static void printNumbers(int n) {
        // Base Case
        if(n == 1) {
            System.out.print(n);
            return;
        }
        
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}