package SampleTest.Problem3;

public class Person implements FamilyMembers {
    private String name;
    protected double income;

    public Person(String name, double income) {
        this.name = name;
        this.income = income;
    }

    @Override
    public double avgIncome() {
        return income;
    }

    @Override
    public double getIncome() {
        return income;
    }
}
