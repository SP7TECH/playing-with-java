package revision2024;
import java.util.Scanner;

public class Practice001 {
    private static int sum = 0;
    
    public static int calcSum(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the count");
            
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter numbers to add: ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("The sum of the numbers entered is: " + calcSum(arr));
        }
    }
}