package Tut.W10.Problem1;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeThread extends Thread {
    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss");
            String formattedDate = dateFormatter.format(now);

            System.out.println(formattedDate);
            try {
                TimeThread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TimeThread t1 = new TimeThread();
        Scanner scanner = new Scanner(System.in);
        t1.start();
    }
}
