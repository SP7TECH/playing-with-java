package basics.BitWiseOperators;
import java.util.Scanner;

public class ShiftOperators {
    public static int leftShift(int a, int b) {
        return (int)(a * Math.pow(b, 2));
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("a << b = " + (a << b));
            System.out.println("With custom methods: a << b = " + leftShift(a, b));
        }
    }
}
