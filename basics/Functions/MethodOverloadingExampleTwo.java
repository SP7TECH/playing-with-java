package basics.Functions;
import java.util.Scanner;

public class MethodOverloadingExampleTwo {
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two int numbers to get their sum");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + sum(a, b));

            System.out.println("Enter two float numbers to get their sum");
            float c = sc.nextFloat();
            float d = sc.nextFloat();
            System.out.println("Result: " + sum(c, d));
        }
    }
}