package SampleTest.Problem4;

import java.util.List;

public class HoangThread extends Thread {
    private String threadName;
    private final Lecturer[] lecturerArray;


    public HoangThread(String threadName, Lecturer[] lecturerArray) {
        this.threadName = threadName;
        this.lecturerArray = lecturerArray;
    }

    @Override
    public void run() {
//        sync the array
        synchronized (lecturerArray) {
            for (Lecturer lecturer : lecturerArray) {
                if (!lecturer.hasProject()) {
                    System.out.println(threadName + " has processed " + lecturer.getName());
                    lecturer.setProject(true);
//                    Notify when it has finished
                    lecturerArray.notifyAll();
                    try {
//                        Wait after it has processed 1 lecturer
                        lecturerArray.wait(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
