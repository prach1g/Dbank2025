public class Crash3 {

    public static void main(String[] args) {

        try {
            int  d1 = Integer.parseInt(args[0]);
            int d2 = Integer.parseInt(args[1]);
            int division = d1 / d2;
            System.out.println("division=" + division);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        /*
        catch(ArithmeticException | NumberFormatException ae)
        {
            System.out.println(ae);
        }*/

        System.out.println("good bye");
    }//end of main
}
