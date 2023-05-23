package Tut.W8.Problem2and3;

import java.util.Iterator;
import java.util.List;

public class RMITStudentHighGpaCollection extends RMITStudentGeneralCollection {
    private List<RMITStudent> studentList;
    private String condition;

    public RMITStudentHighGpaCollection(List<RMITStudent> studentList, String condition) {
        this.studentList = studentList;
        this.condition = condition;
    }

    public Iterator<RMITStudent> iterator() {
        if (condition.toLowerCase().contains("strict")) {
            return new RMITStudentIterator2(studentList);
        }
        return new RMITStudentIterator((studentList));
    }

    static class RMITStudentIterator implements Iterator<RMITStudent> {
        private int position;
        private List<RMITStudent> studentList;

        public RMITStudentIterator(List<RMITStudent> studentList) {
            this.position = 0;
            this.studentList = studentList;
        }

        @Override
        public boolean hasNext() {
            int tempPosition = position;
            while (tempPosition < studentList.size()) {
                if (studentList.get(tempPosition).isShared()) {
                    return true;
                }
                tempPosition++;
            }
            return false;
        }

        @Override
        public RMITStudent next() {
            while (position < studentList.size()) {
                RMITStudent currentStudent = studentList.get(position);
                position++;
                if (currentStudent.isShared()) {
                    return currentStudent;
                }
            }
            return null;
        }
    }

    static class RMITStudentIterator2 implements Iterator<RMITStudent> {
        private int position;
        private List<RMITStudent> studentList;
        private final double MIN_GPA = 6.5;

        public RMITStudentIterator2(List<RMITStudent> studentList) {
            this.position = 0;
            this.studentList = studentList;
        }

        @Override
        public boolean hasNext() {
            int tempPosition = position;
            while (tempPosition < studentList.size()) {
                if (studentList.get(tempPosition).isShared() && studentList.get(tempPosition).getGpa() >= MIN_GPA) {
                    return true;
                }
                tempPosition++;
            }
            return false;
        }

        @Override
        public RMITStudent next() {
            while (position < studentList.size()) {
                RMITStudent currentStudent = studentList.get(position);
                position++;
                if (currentStudent.isShared() && currentStudent.getGpa() >= MIN_GPA) {
                    return currentStudent;
                }
            }
            return null;
        }
    }
}
