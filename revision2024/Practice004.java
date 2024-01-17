package revision2024;
import java.util.Scanner;

public class Practice004 {

    public static void printSquarePattern(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int num) {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void characterPattern(int num) {
        char ch = 'A';
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the star count");

            int num = sc.nextInt();
            printSquarePattern(num);

            System.out.println("Half Pyramid Pattern");
            halfPyramid(num);

            System.out.println("Character Pattern");
            characterPattern(num);
        }
    }
}
