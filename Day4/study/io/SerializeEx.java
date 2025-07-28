package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("books.pra");
            ObjectOutputStream oout = new ObjectOutputStream(fout);

            Book book = new Book(1,"TTT","AAA",20);
            oout.writeObject(book);  //SERIALIZE
            oout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error"+e);
        }
    }
}
