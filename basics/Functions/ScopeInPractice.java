package basics.Functions;

public class ScopeInPractice {

    public static void printS() {
        int s = 14;
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Method Scope
        // System.out.println(s);
        // System.out.println(a);
        
        int a = 15;
        System.out.println(a);

        // Block Scope
        
        if(a <= 15) {
            int b = 10;
            System.out.println(b);
        }
        
        // System.out.println(b);
    }
}
