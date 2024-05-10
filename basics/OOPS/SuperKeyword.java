package basics.OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Laptop dell = new Laptop();
        System.out.println(dell.color);
    }
}

class Device {
    String color;

    Device() {
        System.out.println("Device class constructor called");
    }
}

class Laptop extends Device {
    Laptop() {
        super.color = "Black";
        System.out.println("Laptop class constructor called");
    }
}
