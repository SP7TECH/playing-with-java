package revision2024;
import java.util.Scanner;

public class Practice003 {
    private static int reverse = 0;

    public static void reverseNumber(int num) {
        int lastDigit = 0;
        while(num > 0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");

            int num = sc.nextInt();
            reverseNumber(num);
            System.out.println("Reverse of the number is: " + reverse);
        }
    }
}
