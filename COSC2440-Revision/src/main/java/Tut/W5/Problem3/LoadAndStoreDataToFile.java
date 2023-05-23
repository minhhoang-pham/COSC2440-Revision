package Tut.W5.Problem3;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class LoadAndStoreDataToFile {
    final static String FULLTIMETYPE = "FULLTIME";
    final static String PARTTIMETYPE = "PARTTIME";
    final static String FILENAME = "COSC2440-Revision/src/main/java/Tut/W5/Problem3/students.obj";

    public static Student createStudent() {
        Scanner userInput = new Scanner(System.in);
//        Ask user for all the data
        System.out.println("Please enter the student ID");
        String studentId = userInput.nextLine();
        System.out.println("Please enter the student name");
        String name = userInput.nextLine();
        System.out.println("Please enter the student major");
        String major = userInput.nextLine();
        System.out.println("Please enter the student type (FULLTIME/PARTTIME)");
        String type = userInput.nextLine();
        System.out.println("Please enter the student GPA");
        double gpa = Double.parseDouble(userInput.nextLine());

//        Create Student variable
        Student student;
//        Check if student is full time
        if (type.equalsIgnoreCase(FULLTIMETYPE)) {
//            Create full time student
            student = new FullTimeStudent(studentId, name, major, gpa);
        } else if (type.equalsIgnoreCase(PARTTIMETYPE)) {
//            If student is part-time then ask for min and max hours then create part-time student
            System.out.println("Please enter the minimum hours");
            int minHours = userInput.nextInt();
            System.out.println("Please enter the maximum hours");
            int maxHours = userInput.nextInt();
            student = new PartTimeStudent(studentId, name, major, gpa, minHours, maxHours);
        } else {
//            Invalid type will result in null
            System.out.println("Invalid type");
            student = null;
        }

        userInput.close();
        return student;
    }

    public static void displayAllStudents (List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void getDataFromUser(List<Student> students) {
        Scanner userInput = new Scanner(System.in);


        while (true) {
//            Check the user option
            System.out.println("Create a new student (Yes) or Exit (No)");
            String input = userInput.nextLine();
//            If not exit then continue with the code
            if (input.equalsIgnoreCase("Yes")) {
//                Prompt to create student
                Student student = createStudent();
//                If the method doesn't return null, add the student to the list
                if (student != null) {
                    students.add(student);
                }
            } else {
                break;
            }
        }

        userInput.close();
        System.out.println("Getting data from user is done");
    }

    public static void saveDataToFile(List<Student> students) throws IOException {
        FileOutputStream fOut = new FileOutputStream(FILENAME);
        ObjectOutputStream writer = new ObjectOutputStream(fOut);

//        Write number of students
        writer.writeInt(students.size());
        for (Student student : students) {
//            Write individual students
            writer.writeObject(student);
        }

        writer.close();
        System.out.println("Writing object to file is done");

    }

    public static void loadDataFromFile(List<Student> students) throws IOException, ClassNotFoundException {
        File studentFile = new File(FILENAME);
        if (!studentFile.exists()) {
            System.out.println("No data file exists");
            return;
        }

        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(studentFile));
        int numberOfObjects = reader.readInt();
        for (int i = 0; i < numberOfObjects; i++) {
            students.add((Student) (reader.readObject()));
        }

        reader.close();
        System.out.println("Reading from file is done");
    }
}
