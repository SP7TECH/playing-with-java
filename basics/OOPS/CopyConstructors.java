package basics.OOPS;

public class CopyConstructors {
    public static void main(String[] args) {
        Scholar s1 = new Scholar();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Scholar s2 = new Scholar(s1);
        s2.password = "efgh";
        System.out.println("Name: " + s2.name + ", Roll: " + s2.roll + ", Password: " + s2.password);

        s1.marks[2] = 95;
        for(int i = 0; i < s1.marks.length; i++) {
            System.out.print(s2.marks[i] + ", ");
        }
    }    
}

class Scholar {
    String name;
    int roll;
    String password;
    int marks[];

    Scholar() {
        marks = new int[3];
        System.out.println("constructor called");
    }

    Scholar(Scholar s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = s1.marks;
    }
}