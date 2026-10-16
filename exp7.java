class Employee {
    int empid = 101;
    String name = "Ramesh";
    double salary = 25000.0;

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}