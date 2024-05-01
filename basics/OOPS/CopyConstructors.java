package basics.OOPS;

public class CopyConstructors {
    public static void main(String[] args) {
        Scholar s1 = new Scholar();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";

        Scholar s2 = new Scholar(s1);
        s2.password = "efgh";
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
    }    
}

class Scholar {
    String name;
    int roll;
    String password;
    int marks[];

    Scholar() {
        System.out.println("constructor called");
    }

    Scholar(Scholar s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}