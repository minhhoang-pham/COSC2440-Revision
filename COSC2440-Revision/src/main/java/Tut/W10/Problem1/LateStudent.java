package Tut.W10.Problem1;

public class LateStudent extends StudentDecorator{
    private static final double LATE_PENALTY_RATE = 0.1;

    public LateStudent(Student student) {
        super(student);
    }

    @Override
    public double calcFee() {
//        Base behavior
        double totalCourseAmount = student.calcFee();

//        Decorated behavior
        return (LATE_PENALTY_RATE + 1) * totalCourseAmount;
    }
}
