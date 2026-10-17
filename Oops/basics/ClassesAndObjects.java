class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Aarav";
        student.age = 19;
        student.introduce();
    }
}
