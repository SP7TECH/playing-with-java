package basics.BitWiseOperators;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Bit-wise AND: " + (a & b));

            System.out.println("Bit-wise OR: " + (a | b));

            System.out.println("Bit-wise XOR: " + (a ^ b));
        }
    }
}
