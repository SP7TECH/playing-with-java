package revision2024;

public class Practice006 {
    public static void modifyOriginal(int arr[], int num) {
        num = 30;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void main(String[] args) {
        int num = 25;
        int arr[] = {10, 20, 30};

        // Pass by reference vs Pass by value
        modifyOriginal(arr, num);
        System.out.println(num);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
