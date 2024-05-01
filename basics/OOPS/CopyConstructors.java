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

        // Scholar s2 = new Scholar(s1);
        // s2.password = "efgh";
        // System.out.println("Name: " + s2.name + ", Roll: " + s2.roll + ", Password: " + s2.password);

        // for(int i = 0; i < s1.marks.length; i++) {
        //     System.out.print(s2.marks[i] + " ");
        // }
        // System.out.println();


        

        Scholar s3 = new Scholar(s1, "newPassword");
        s1.marks[2] = 95;
        System.out.println("Name: " + s3.name + ", Roll: " + s3.roll + ", Password: " + s3.password);

        for(int i = 0; i < s1.marks.length; i++) {
            System.out.print(s3.marks[i] + " ");
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

    // shallow copy constructor
    Scholar(Scholar s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        marks = s1.marks;
    }

    // deep copy constructor
    Scholar(Scholar s1, String password) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = password;
        
        for(int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}