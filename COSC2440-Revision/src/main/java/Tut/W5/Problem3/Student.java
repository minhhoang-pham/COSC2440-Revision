package Tut.W5.Problem3;

public abstract class Student {
    private String studentId;
    private String name;
    private String major;
    private double gpa;

    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object other) {
//        Check if object is compared to itself
        if (other == this) {
            return true;
        }

//        Check if object is an instance of student
        if (!(other instanceof Student)) {
            return false;
        }

//        Compare the id after type casting the object to student
        return this.studentId.equals(((Student) other).studentId);
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Major: %s", studentId, name, major);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
}
