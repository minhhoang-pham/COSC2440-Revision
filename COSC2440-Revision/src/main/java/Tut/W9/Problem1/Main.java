package Tut.W9.Problem1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Intro to Programming");
        courses.add("Programming 1");
        courses.add("Further Programming");
        Student regularStudent = new RegularStudent("s001", "Hoang", 3.9, courses, 2000);
        System.out.printf("Fee for regular student: %.2f%n", regularStudent.calcFee());

        Student lateStudent = new LateStudent(regularStudent);
        System.out.printf("Fee for late student: %.2f%n", lateStudent.calcFee());

        Student outstandingStudent = new OutstandingStudent(regularStudent);
        System.out.printf("Fee for outstanding student: %.2f%n", outstandingStudent.calcFee());

        Student lateOutstandingStudent = new OutstandingStudent(lateStudent);
        System.out.printf("Fee for outstanding student: %.2f%n", lateOutstandingStudent.calcFee());

    }
}
