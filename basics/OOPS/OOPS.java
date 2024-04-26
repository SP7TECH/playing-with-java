package basics.OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.tipThickness = 1;
        System.out.println(p1.tipThickness);
    }
}

class Pen {
    private String color;
    int tipThickness;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setThickness(int thickness) {
        tipThickness = thickness;
    }
}

class Student {
    String name;
    int age;
    float cgpa;

    void calcCGPA(int phy, int chem, int maths) {
        cgpa = (phy + chem + maths) + 3;
    }
}
