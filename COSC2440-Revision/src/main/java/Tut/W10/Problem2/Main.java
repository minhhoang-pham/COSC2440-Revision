package Tut.W10.Problem2;

public class Main {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer();
        LecturerThread t1 = new LecturerThread(l1);
        LecturerThread t2 = new LecturerThread(l1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
