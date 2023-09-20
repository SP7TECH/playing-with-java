package beginner.Functions;
import java.util.Scanner;

public class FunctionsWithParam {

    public static int calcSum(int[] num) {
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of array");

            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the numbers you want to get the sum of: ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("The sum of the entered numbers is " + calcSum(arr));
        }
    }
}
