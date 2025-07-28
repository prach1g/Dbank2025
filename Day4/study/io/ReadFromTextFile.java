package study.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

    public static void main(String[] args)  {
        try {
            FileReader fr = new FileReader("info.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(true) {
                line = br.readLine();
                if(line == null) {
                    System.out.println("file reading completed");
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error"+e.getMessage());
        }
    }
}
