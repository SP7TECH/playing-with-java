package beginner.Intro;

public class TypeCasting {
    public static void main(String args[]) {

        // lossy conversions
        float a = 25.15f;
        int b = (int) a;

        System.out.println(b);

        int num = 25;
        System.out.println(num == 25 ? "working" : "not working");
    }
}
