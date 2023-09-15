package beginner.Intro;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]) {
        System.out.println("Enter two numbers to add");

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("The sum of the numbers is " + (a + b));
        }
    }
}
