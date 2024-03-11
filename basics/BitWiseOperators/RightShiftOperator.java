package basics.BitWiseOperators;
import java.util.Scanner;

public class RightShiftOperator {
    public static int rightShift(int a, int b) {
        return (int) (a / Math.pow(2, b));
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two number: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("a >> b = " + (a >> b));
            System.out.println("With methods: a >> b = " + rightShift(a, b));
        }   
    }
}
