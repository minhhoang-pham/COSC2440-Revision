package SampleTest.Problem1;

import java.util.ArrayList;

public class MonthlyPayment implements EmployeeProject {

    public static double totalAmount() {
        double totalAmount = 0;
        for(EmployeeProject entity : list) {
            if (entity instanceof Employee) {
                totalAmount += ((Employee) entity).getSalary();
            } else if (entity instanceof HourlyProject) {
                totalAmount += ((HourlyProject) entity).getRatePerHour() * ((HourlyProject) entity).getHoursPerMonth();
            }
        }
        return totalAmount;
    }
}
