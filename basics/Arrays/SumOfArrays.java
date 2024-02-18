package basics.Arrays;
import java.util.Scanner;

public class SumOfArrays {
    public static int printSum(int arr[]) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the length of the array");
            int n = sc.nextInt();

            int marks[] = new int[n];

            System.out.println("Enter " + n + " numbers to get their sum");
            for(int i = 0; i < n; i++) {
                marks[i] = sc.nextInt();
            }

            System.out.println(printSum(marks));

        }
    }
}
