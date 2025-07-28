package study.inheritance;

public class UserOfInterface {
    public static void main(String[] args) {
        // Printable printable = new Printable() ;

        Printable p = new DesignPrint(); //valid due to inheritance
        p.print("Good Morning");
        p.timestamp();

    }
}
