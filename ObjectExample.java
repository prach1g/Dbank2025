public class ObjectExample {
    public static void main(String[] args) {

        Object obj = new Object();
        Complex c = new Complex();
        String s = new String();

        //System.out.println(obj.toString());
        System.out.println(c.toString());
        //System.out.println(s.toString());

        System.out.println(c); // internally toString is called


    }
}
