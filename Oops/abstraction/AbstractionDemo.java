abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with a key.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}
