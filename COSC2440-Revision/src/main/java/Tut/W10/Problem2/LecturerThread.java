package Tut.W10.Problem2;

import java.util.ArrayList;
import java.util.List;

public class LecturerThread extends Thread {
    Lecturer lecturer;

    public LecturerThread(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public void run() {
        synchronized (lecturer){
            if (lecturer.projectLed == null) {
                System.out.println("The lecturer isn't leading a project, assigning a project");
                lecturer.projectLed = new Project();
            }

        }
    }
}
