package revision2024;
import java.util.Scanner;

public class Practice015 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two numbers: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            Calculator c1 = new Calculator(a, b);
            System.out.println("Addition: " + c1.add());
            System.out.println("Subtraction: " + c1.subtract());
            System.out.println("Multiplication: " + c1.multiply());
            System.out.println("Division: " + c1.divide());
        }
    }
}

class Calculator {
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return this.a + this.b;
    }

    int subtract() {
        return this.a - this.b;
    }

    int multiply() {
        return this.a * this.b;
    }

    int divide() {
        return this.a / this.b;
    }
}