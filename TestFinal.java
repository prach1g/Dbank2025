public class TestFinal {

    public static void main(String[] args) {
         final String s="alpha";
        // s="beta";
        System.out.println(s);
        final Complex c = new Complex(100,2.0);
        c.real=200;  // allowed for mutable
        System.out.println(c.real+ " "+c.im);

        //c = new Complex();  //this is not allowed
        final int x=10;
       // x=20;
    }
}
