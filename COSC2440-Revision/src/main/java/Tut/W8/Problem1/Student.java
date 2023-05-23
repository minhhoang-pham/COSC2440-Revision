package Tut.W8.Problem1;

public class Student {
        private String studentId;
        private String name;
        private String major;

        public Student(String studentId, String name, String major) {
            this.studentId = studentId;
            this.name = name;
            this.major = major;
        }

        @Override
        public boolean equals(Object other) {
//        Check if object is compared to itself
            if (other == this) {
                return true;
            }

//        Check if object is an instance of student
            if (!(other instanceof Student)) {
                return false;
            }

//        Compare the id after type casting the object to student
            return this.studentId.equals(((Student) other).studentId);
        }

        @Override
        public String toString() {
            return String.format("ID: %s, Name: %s, Major: %s", studentId, name, major);
        }

        public String getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public void setName(String name) {
            this.name = name;
        }

}
