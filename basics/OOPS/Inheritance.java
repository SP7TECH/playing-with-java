package basics.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish salmon = new Fish();
        salmon.eats();
    }
}

class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}