package basics.BitWiseOperators;
import java.util.Scanner;

public class IthBitOperations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        }

        return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            System.out.println("Enter the position to check if the bit is 1 or 0: ");
            int i = sc.nextInt();

            System.out.println(getIthBit(n, i));

            System.out.println("Enter the position to set the bit as 1: ");
            int position = sc.nextInt();
            System.out.println(setIthBit(n, position));
        }
    }
}
