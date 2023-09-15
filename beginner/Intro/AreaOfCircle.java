package beginner.Intro;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");
        try (Scanner sc = new Scanner(System.in)) {
            double r = sc.nextDouble();
            double area = Math.PI * Math.pow(7, 2);

            System.out.println("The area of the circle for radius " + r + " is " + area);
        }
    }
}
