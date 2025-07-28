
package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteToTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("info.txt",true);
        PrintWriter pw = new PrintWriter(fos);

        //Go on accepting from KBD and add to file till user enters finsih

        pw.println("Test");
        pw.flush(); // write the data from buffer to hard disk
        pw.close();
    }
}
