package Tut.W8.Problem1;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController(new Student(null, null, null), new StudentViewText());
        controller.eventLoop();
    }
}
