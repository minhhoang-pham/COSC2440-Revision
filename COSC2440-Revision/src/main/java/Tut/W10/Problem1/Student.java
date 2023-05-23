package Tut.W10.Problem1;

import java.util.List;

public abstract class Student {
    protected String id;
    protected String name;
    protected double gpa;
    protected List<String> courses;

    public Student(String id, String name, double gpa, List<String> courses) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    public abstract double calcFee();

}
