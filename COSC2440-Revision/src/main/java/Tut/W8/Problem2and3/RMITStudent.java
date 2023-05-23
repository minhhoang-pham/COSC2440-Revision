package Tut.W8.Problem2and3;

public class RMITStudent {
    private String id;
    private String name;
    private double gpa;
    private boolean isShared;

    public RMITStudent(String id, String name, double gpa, boolean isShared) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.isShared = isShared;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShared() {
        return isShared;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, NAME: %s, GPA: %s, ISSHARED: %b", id, name, gpa, isShared);
    }
}
