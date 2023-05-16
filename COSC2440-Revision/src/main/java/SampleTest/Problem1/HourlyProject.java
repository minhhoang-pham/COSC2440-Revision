package SampleTest.Problem1;

import java.util.ArrayList;
import java.util.List;

public class HourlyProject extends Project implements EmployeeProject{
    private double ratePerHour;
    private int hoursPerMonth;

    public HourlyProject(String name, int startDate, String personInCharge, double ratePerHour, int hoursPerMonth) {
        super(name, startDate, personInCharge);
        this.ratePerHour = ratePerHour;
        this.hoursPerMonth = hoursPerMonth;
    }

    public static void addHourlyProject(HourlyProject project) {
        list.add(project);
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }
}
