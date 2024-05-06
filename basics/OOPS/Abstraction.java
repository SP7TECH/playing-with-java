package basics.OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Car nexon = new Car();
        nexon.accelerate();
        nexon.transmission();
        System.out.println(nexon.color);
        nexon.changeColor();
        System.out.println(nexon.color);

        Bike pulsar = new Bike();
        pulsar.accelerate();
        pulsar.transmission();

        Splendor s1 = new Splendor();
        s1.accelerate();
    }
}






abstract class Vehicle {
    String color;
    Vehicle() {
        color = "white";
        System.out.println("In vehicle class");
    }

    void accelerate() {
        System.out.println("Can accelerate");
    }

    abstract void transmission();
}

class Car extends Vehicle {
    void changeColor() {
        color = "black";
    }
    
    void transmission() {
        System.out.println("Has 6 transmission including reverse");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("In Bike class");
    }

    void changeColor() {
        color = "red";
    }

    void transmission() {
        System.out.println("Has 4 transmission");
    }
}

class Splendor extends Bike {
    Splendor() {
        System.out.println("In Splendor class");
    }
}