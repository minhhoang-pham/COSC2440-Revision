package Tut.W5.Problem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the file name");
        String fileName = "COSC2440-Revision/src/main/java/Tut/W5/Problem1" + userInput.nextLine();

        BufferedReader bReader;
        boolean exitNow;

        try {
            bReader = new BufferedReader(new FileReader(fileName));
            String line = bReader.readLine();

            while (line != null) {
                System.out.println(line);
                System.out.println("Enter to continue or type 'X' to exit");
                exitNow = userInput.nextLine().equals("X");

                if (exitNow) {
                    break;
                }

                line = bReader.readLine();
            }

            userInput.close();
            bReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
