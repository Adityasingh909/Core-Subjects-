interface Payable {
    double calculatePay();
}

class Employee implements Payable {
    private final double monthlySalary;

    Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payable employee = new Employee(45000);
        System.out.println("Monthly pay: " + employee.calculatePay());
    }
}
