class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) { // Overloading: different parameter types
        return a + b;
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() { // Overriding: subclass changes inherited behavior
        System.out.println("Drawing a circle.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.5, 3.5));

        Shape shape = new Circle(); // Runtime polymorphism
        shape.draw();
    }
}
