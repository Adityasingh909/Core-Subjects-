class Person {
    static int count = 0;
    final String name;

    Person(String name) {
        this.name = name; // this refers to the current object
        count++;
    }

    void introduce() {
        System.out.println("My name is " + name);
    }
}

class CollegeStudent extends Person {
    CollegeStudent(String name) {
        super(name); // calls the parent constructor
    }
}

public class ThisSuperStaticFinalDemo {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("Aarav");
        student.introduce();
        System.out.println("People created: " + Person.count);
    }
}
