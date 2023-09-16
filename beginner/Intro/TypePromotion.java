package beginner.Intro;

public class TypePromotion {
    public static void main(String args[]) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)a);        
        // System.out.println((int)b);
        // System.out.println(b - a);

        int a = 10;
        long b = 20;
        float c = 25.5f;
        double d = 30;

        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
