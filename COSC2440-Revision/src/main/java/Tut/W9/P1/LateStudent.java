package Tut.W9.P1;

import java.util.List;

public class LateStudent extends StudentDecorator{
    private static final double LATE_PENALTY_RATE = 0.1;

    public LateStudent(Student student) {
        super(student);
    }

    @Override
    public double calcFee() {
        return (LATE_PENALTY_RATE + 1) * student.calcFee();
    }
}
