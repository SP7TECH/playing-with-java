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

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int updateBit2(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1) << i;
        return n & bitMask;
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

            System.out.println("Enter the position to clear the bit i.e. make it 0: ");
            int pos = sc.nextInt();
            System.out.println(clearIthBit(n, pos));

            System.out.println("Enter the position and new bit: ");
            int newPos = sc.nextInt();
            int newBit = sc.nextInt();
            System.out.println(updateBit(n, newPos, newBit));
            System.out.println(updateBit2(n, newPos, newBit));

            System.out.println("Enter the number of bits to clear: ");
            int bitsToClear = sc.nextInt();
            System.out.println(clearLastIBits(n, bitsToClear));
        }
    }
}
