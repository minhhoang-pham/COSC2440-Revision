package SampleTest.Problem1;

public abstract class Project {
    private String name;
    private int startDate;
    private String personInCharge;

    public Project(String name, int startDate, String personInCharge) {
        this.name = name;
        this.startDate = startDate;
        this.personInCharge = personInCharge;
    }
}
