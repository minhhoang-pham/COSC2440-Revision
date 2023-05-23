package Tut.W9.P1;

public class OutstandingStudent extends StudentDecorator{
    private static final double FEE_DISCOUNT = 1000;

    public OutstandingStudent(Student student) {
        super(student);
    }

    @Override
    public double calcFee() {
//        Base behavior
        double totalCourseAmount = student.calcFee();

//        Decorated behavior
        return totalCourseAmount > FEE_DISCOUNT ? (totalCourseAmount - FEE_DISCOUNT) : 0;
    }
}
