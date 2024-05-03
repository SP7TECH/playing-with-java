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

        // Hierarchial
        Fish shark = new Fish();
        shark.eats();
        shark.swims();

        Mammals monkey = new Mammals();
        monkey.eats();
        monkey.walks();

        Bird pigeon = new Bird();
        pigeon.eats();
        pigeon.fly();
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

    void swims() {
        System.out.println("swims in water");
    }
}

class Mammals extends Animal {
    int legs;

    void walks() {
        System.out.println("walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

class Dog extends Mammals {
    String breed;
}