package Tut.W10.Problem1;

public abstract class StudentDecorator extends Student{
    protected Student student;

    public StudentDecorator(Student student) {
        super(student.id, student.name, student.gpa, student.courses);
        this.student = student;
    }
}
