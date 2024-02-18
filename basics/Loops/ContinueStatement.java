package basics.Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(i == 3) {
                System.out.println("Skiped the third iteration");
                continue;
            }
            System.out.println(i);
        }
    }
}
