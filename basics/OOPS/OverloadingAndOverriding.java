package basics.OOPS;

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        // Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.add(4, 9));
        System.out.println(calc.add((float)3.30, (float) 7.70));
        System.out.println(calc.add(12, 15, 23));
    
        // Overriding
        Player p1 = new Player();
        p1.plays();

        Footballer f1 = new Footballer();
        f1.plays();
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Player {
    void plays() {
        System.out.println("plays a sport");
    }
}

class Footballer extends Player {
    void plays() {
        System.out.println("plays football");
    }
}