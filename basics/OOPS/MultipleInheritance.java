package basics.OOPS;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatsHerb();
        b1.eatsFlesh();
    }
}

interface Herbivore {
    void eatsHerb();
}

interface Carnivore {
    void eatsFlesh();
}

class Bear implements Herbivore, Carnivore {
    public void eatsHerb() {
        System.out.println("Eats Herb");
    }

    public void eatsFlesh() {
        System.out.println("Eats Flesh");
    }
}
