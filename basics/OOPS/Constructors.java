package basics.OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);

        Student s2 = new Student(26);
        System.out.println(s2.age);
    }
}

class Student {
    String name;
    int age;

    Student() {
        System.out.println("Constructor called");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }
}
