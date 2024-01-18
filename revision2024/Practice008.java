package revision2024;

public class Practice008 {
    // Unique Pairs
    public static void printUniquePairs(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + currentElement + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
        printUniquePairs(arr);    
    }
}
