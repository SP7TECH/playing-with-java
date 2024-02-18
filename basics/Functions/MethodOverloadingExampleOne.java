package basics.Functions;
import java.util.Scanner;

public class MethodOverloadingExampleOne {
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers to get their sum");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + sum(a, b));

            System.out.println("Enter three numbers to get their sum");
            a = sc.nextInt();
            b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Result: " + sum(a, b, c));

            System.out.println("Enter four numbers to get their sum");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("Result: " + sum(a, b, c, d));
        }
    }
}
