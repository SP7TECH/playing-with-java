package basics.Functions;

public class CallByValue {
    
    public static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside function");
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        swapValues(a, b);

        System.out.println("Inside main");
        System.out.println(a);
        System.out.println(b);
    }
}