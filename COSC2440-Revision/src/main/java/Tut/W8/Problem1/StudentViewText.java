package Tut.W8.Problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentViewText extends StudentView{
    @Override
    public void displayStudent(Student s) {
        System.out.println("Begin text view:");
        System.out.println("Student ID: " +s.getStudentId());
        System.out.println("Name: " +s.getName());
        System.out.println("Major: " +s.getMajor());
        System.out.println("End text view");
    }

    @Override
    public Map<String, String> displayStudentForm() {
        Scanner scanner = DataInput.getDataInput().getScanner();
        Map<String, String> studentInformation = new HashMap<>();
        System.out.println("New student information form");
        System.out.print("Enter student ID: ");
        studentInformation.put(STUDENT_ID, scanner.nextLine());
        System.out.print("Enter student name: ");
        studentInformation.put(NAME, scanner.nextLine());
        System.out.print("Enter student major: ");
        studentInformation.put(MAJOR, scanner.nextLine());
        System.out.println("Successfully added student");
        return studentInformation;
    }
}
