package SampleTest.Problem4;

public class Main {
    public static void main(String[] args) {
        Lecturer[] lecturers = new Lecturer[4];
        lecturers[0] = new Lecturer("Alice");
        lecturers[1] = new Lecturer("Bob");
        lecturers[2] = new Lecturer("Carol");
        lecturers[3] = new Lecturer("David");
        Thread t1 = new HoangThread("Thread 1", lecturers);
        Thread t2 = new HoangThread("Thread 2", lecturers);
        t1.start();
        t2.start();
    }
}
