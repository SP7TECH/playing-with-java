package basics.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Single level
        Fish salmon = new Fish();
        salmon.eats();

        // Multi level
        Dog Gigi = new Dog();
        Gigi.eats();
        Gigi.breed = "Rottweiler";
        System.out.println(Gigi.breed);

        Gigi.legs = 4;
        System.err.println(Gigi.legs);
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

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}