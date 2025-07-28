package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream f = new FileInputStream("books.pra");
        ObjectInputStream oi = new ObjectInputStream(f);
        Object obj = oi.readObject(); //DESerialize the object
        System.out.println(obj.toString());

    }
}
