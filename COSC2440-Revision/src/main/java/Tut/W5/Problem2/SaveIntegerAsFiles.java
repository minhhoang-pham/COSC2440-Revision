package Tut.W5.Problem2;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SaveIntegerAsFiles {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a list of integers");
//        Tokenizer to split the string
        StringTokenizer integersTokenizer = new StringTokenizer(userInput.nextLine());
//        Create an array of integers with length the same as the token
        Integer[] inputIntegers = new Integer[integersTokenizer.countTokens()];

        for (int i = 0; i < inputIntegers.length; i++) {
//            Assign the integer from the token
            inputIntegers[i] = Integer.parseInt(integersTokenizer.nextToken());
        }

        userInput.close();
        System.out.println("Integer reading is done");

//        Output to binary file
        FileOutputStream fout = new FileOutputStream("COSC2440-Revision/src/main/java/Tut/W5/Problem2/integer.dat");
        DataOutputStream dout = new DataOutputStream(fout);
        for (int i : inputIntegers) {
//            Write integer to binary file
            dout.writeInt(i);
        }
//        Close after usage
        fout.close();
        dout.close();

//        Output to text file
        FileWriter fw = new FileWriter("COSC2440-Revision/src/main/java/Tut/W5/Problem2/integer.txt");
        for (int i : inputIntegers) {
//            Write integer to text file
            fw.write(String.valueOf(i));
        }

        fw.close();
        System.out.println("Writing to text file is done");
    }

}
