package SampleTest.Problem1;

public class Employee implements EmployeeProject {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void addEmployee(Employee employee) {
        list.add(employee);
    }

    public double getSalary() {
        return salary;
    }
}
