package Tut.W1To4;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> studentList;

    public StudentGroup() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
