package SampleTest.Problem4;

import java.util.List;

public class HoangThread {
    private String threadName;
    private List<Lecturer> lecturerList;

    public HoangThread(String threadName, List<Lecturer> lecturerList) {
        this.threadName = threadName;
        this.lecturerList = lecturerList;
    }
}
