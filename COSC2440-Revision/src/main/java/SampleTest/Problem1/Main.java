package SampleTest.Problem1;

public class Main {
    public static void main(String[] args) {
        Employee.addEmployee(new Employee("Joe", 10000));
        Employee.addEmployee(new Employee("Jack", 15000));
        Employee.addEmployee(new Employee("Jill", 20000));
        Employee.addEmployee(new Employee("John", 25000));
        HourlyProject.addHourlyProject(new HourlyProject("Project 1", 11, "John", 500, 100));
        HourlyProject.addHourlyProject(new HourlyProject("Project 2", 5, "Jill", 300, 200));
        System.out.println("Monthly payment is "+ MonthlyPayment.totalAmount());
    }
}
