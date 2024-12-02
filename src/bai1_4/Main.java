package bai1_4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(7, "John Doe", 50000);
        System.out.println(employee.toString());
        employee.raiseSalary(10);
        System.out.println("After salary raise:");
        System.out.println(employee.toString());

    }
}
