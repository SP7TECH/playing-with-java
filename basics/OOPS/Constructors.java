package basics.OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Shradha");
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }
}
