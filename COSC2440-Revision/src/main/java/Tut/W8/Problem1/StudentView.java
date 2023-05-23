package Tut.W8.Problem1;

import java.util.Map;

public abstract class StudentView {
//    Fields to store user input for lookup
    public static final String STUDENT_ID = "STUDENT_ID";
    public static final String NAME = "NAME";
    public static final String MAJOR = "MAJOR";

//    Display a student
    public abstract void displayStudent(Student s);

//    Display student form
    public abstract Map<String, String> displayStudentForm();
}
