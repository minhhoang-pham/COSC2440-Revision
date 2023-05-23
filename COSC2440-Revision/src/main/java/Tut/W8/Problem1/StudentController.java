package Tut.W8.Problem1;

import java.util.Map;
import java.util.Scanner;

public class StudentController {
    Student student;
    StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void eventLoop() {
        String continuePrompt = "Y";
        Scanner scanner = DataInput.getDataInput().getScanner();
        while (continuePrompt.equalsIgnoreCase("Y")) {
            Map<String, String> data = view.displayStudentForm();
//            Data validation
            String id = data.get(StudentView.STUDENT_ID);
            String name = data.get(StudentView.NAME);
            String major = data.get(StudentView.MAJOR);
            student = new Student(id, name, major);
//            Update view
            view.displayStudent(student);
            System.out.println("Do you want to continue (Y/N)");
            continuePrompt = scanner.nextLine();
        }
    }
}
