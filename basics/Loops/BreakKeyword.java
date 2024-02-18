package basics.Loops;
import java.util.Scanner;

public class BreakKeyword {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a multiple of 10 to come out of the loop");

            do {
                int n = sc.nextInt();
                System.out.println(n);

                if(n % 10 == 0) {
                    break;
                }
            } while(true);
        }
    }
}