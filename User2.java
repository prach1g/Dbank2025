public class User2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(100,1.0);
        Complex c2 = new Complex(100,1.0);

        //if(c1 == c2) //references are compared
        if(c1.equals(c2))
            System.out.println("they are same");
        else
            System.out.println("they are different");
    }
}
