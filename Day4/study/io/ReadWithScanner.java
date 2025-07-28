package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScanner {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("info.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String s =sc.nextLine();
            System.out.println(s);
        }

    }//end of main
}//end of class
