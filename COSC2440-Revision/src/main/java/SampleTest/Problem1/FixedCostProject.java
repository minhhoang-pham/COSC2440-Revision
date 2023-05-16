package SampleTest.Problem1;

public class FixedCostProject extends Project{
    private double totalCost;

    public FixedCostProject(String name, int startDate, String personInCharge, double totalCost) {
        super(name, startDate, personInCharge);
        this.totalCost = totalCost;
    }
}
