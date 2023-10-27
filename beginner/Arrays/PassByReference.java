package beginner.Arrays;

public class PassByReference {
    public static void updateArr(int arr[], int nonChangeable) {
        nonChangeable = 30;
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void main(String[] args) {
        
        int nonChangeable = 25;
        int arr[] = {40, 50, 60};

        System.out.println(nonChangeable);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
