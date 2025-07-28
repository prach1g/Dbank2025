package study.inheritance;

import java.util.Date;

public interface Printable {

    public void print(String message);
    public void timestamp();
}

interface Printable2 extends Printable{
    public void showMessageDetails(String message);
}

class BillPrint implements Printable2{

    @Override
    public void showMessageDetails(String message) {

    }

    @Override
    public void print(String message) {

    }

    @Override
    public void timestamp() {

    }
}


//DesignPrint  ISA type of Printable = Interface Inheritance
class DesignPrint implements Printable {
    @Override
    public void print(String message) {
        System.out.println("###### "+message+" ######");
    }
    @Override
    public void timestamp() {
        Date date = new Date();
        System.out.println(date);
    }
}//end of class
