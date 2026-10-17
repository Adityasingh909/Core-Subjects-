class Laptop {
    String brand;
    int ramGb;

    // Parameterized constructor
    Laptop(String brand, int ramGb) {
        this.brand = brand;
        this.ramGb = ramGb;
    }

    void display() {
        System.out.println(brand + " — " + ramGb + " GB RAM");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 16);
        laptop.display();
    }
}
