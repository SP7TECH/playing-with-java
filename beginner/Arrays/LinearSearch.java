package beginner.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static boolean searchInArray(int arr[], int toSearch) {
        boolean exists = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == toSearch) {
                exists = true;
            }
        }

        return exists;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a variable to check whether it exists in the array or not");
            int n = sc.nextInt();

            int arr[] = {10, 20, 30, 40, 50, 60, 70, 80};
            if(searchInArray(arr, n))
                System.out.println("Exists");
            else
                System.out.println("Doesn't exist");
        }
    }
}
