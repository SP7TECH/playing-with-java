package basics.OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Cricketer p1 = new Cricketer();
        p1.setName("Virat Kohli");
        System.out.println(p1.getName());

        p1.team = "India";
        System.out.println(p1.team);

        Cricketer p2 = new Cricketer();
        System.out.println(p2.team);
    }    
}

class Cricketer {
    String name;
    int goals;
    static String team;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
