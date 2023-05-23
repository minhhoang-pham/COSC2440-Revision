package Tut.W5.Problem3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = new ArrayList<Student>();
        LoadAndStoreDataToFile.loadDataFromFile(students);
        LoadAndStoreDataToFile.getDataFromUser(students);
        LoadAndStoreDataToFile.displayAllStudents(students);
        LoadAndStoreDataToFile.saveDataToFile(students);
        Stream<Student> st = students.stream();
//        st.filter(s -> s instanceof FullTimeStudent)
//          .map(s -> {s.setName(s.getName().substring(0, s.getName().indexOf(' ')).toUpperCase()); return s;})
//          .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
//          .forEach(s -> System.out.println("ID="+s.getStudentId()+",NAME="+s.getName()+",MAJOR="+s.getMajor()+",GPA="+s.getGpa()));

    }

}
