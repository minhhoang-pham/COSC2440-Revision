package Tut.W8.Problem2and3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RMITStudent> students = new ArrayList<RMITStudent>();
        RMITStudent stu1 = new RMITStudent("s01", "Alice", 8.0, true);
        RMITStudent stu2 = new RMITStudent("s02", "Peter", 4.0, false);
        RMITStudent stu3 = new RMITStudent("s03", "Bob", 9.0, true);
        RMITStudent stu4 = new RMITStudent("s04", "Carl", 10.0, false);
        RMITStudent stu5 = new RMITStudent("s05", "Anders", 6.4, true);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        String strictCondition = "strict";
        String normalCondition = "normal";

        RMITStudentGeneralCollection studentCollection = new RMITStudentHighGpaCollection(students, normalCondition);
        Iterator<RMITStudent> iterator = studentCollection.iterator();
        while (iterator.hasNext()) {
            RMITStudent stu = iterator.next();
            System.out.println(stu);
        }

        RMITStudentGeneralCollection studentCollection2 = new RMITStudentHighGpaCollection(students, strictCondition);
        Iterator<RMITStudent> iterator2 = studentCollection2.iterator();
        while (iterator2.hasNext()) {
            RMITStudent stu = iterator2.next();
            System.out.println(stu);
        }
    }
}
