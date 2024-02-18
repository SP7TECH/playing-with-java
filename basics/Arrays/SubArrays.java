package basics.Arrays;

public class SubArrays {
    public static void printSubArrays(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int start = i;
            for(int j = i + 1; j < n; j++) {
                int end = j;
                for(int k = start; k < end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total number of sub arrays: " + (n * (n + 1)) / 2);
    }

    public static void main(String[] args) {
     
        int arr[] = {2, 4, 6, 8, 10};
        printSubArrays(arr);

    }
}
