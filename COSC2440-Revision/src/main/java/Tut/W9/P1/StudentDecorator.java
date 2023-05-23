package Tut.W9.P1;

import java.util.List;

public abstract class StudentDecorator extends Student{
    protected Student student;

    public StudentDecorator(Student student) {
        super(student.id, student.name, student.gpa, student.courses);
        this.student = student;
    }
}
