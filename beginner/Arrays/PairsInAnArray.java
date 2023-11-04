package beginner.Arrays;

public class PairsInAnArray {
    public static void printPairs(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int current = arr[i];
            for(int j = i + 1; j < n; j++) {
                System.out.print("(" + current + ", " + arr[j] + ")");
            }
            System.out.println();
        }

        System.out.println("Number of pairs — " + n * (n - 1) / 2);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printPairs(arr);
    }
}
