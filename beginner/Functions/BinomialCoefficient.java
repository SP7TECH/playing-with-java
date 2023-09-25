package beginner.Functions;
import java.util.Scanner;

public class BinomialCoefficient {

    public static int calcFactorial(int n) {
        int factorial = 1;
        while(n >= 1) {
            factorial *= n;
            n--;
        }

        return factorial;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n and r respectively to get the Binomial Coefficient");

            int n = sc.nextInt();
            int r = sc.nextInt();

            int nFactorial = calcFactorial(n);
            int rFactorial = calcFactorial(r);
            int diffFactorial = calcFactorial(n - r);

            int binomialCoeff = (nFactorial / (rFactorial * diffFactorial));

            System.out.println("THe binomial coefficient is " + binomialCoeff);

        }
    }
}
