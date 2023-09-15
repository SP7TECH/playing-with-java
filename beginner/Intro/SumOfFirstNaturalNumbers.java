package beginner.Intro;
import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String args[]) {

        System.out.println("Enter a number to get the sum of natural numbers upto the number entered");

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;

            for(int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("The sum of the natural numbers upto " + n + " is " + sum);
        }
    }
}
