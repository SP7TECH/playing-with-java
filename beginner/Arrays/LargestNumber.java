package beginner.Arrays;
import java.lang.Integer;

public class LargestNumber {

    public static void findLargestAndSmallest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; 

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest value: " + largest);        
        System.out.println("Smallest value: " + smallest);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 7, 8, 9, 2};
        findLargestAndSmallest(arr);
    }   
    
}
