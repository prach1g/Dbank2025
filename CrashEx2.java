public class CrashEx2 {

    public static void main(String[] args) {

        try {
        int  d1 = Integer.parseInt(args[0]);
        int d2 = Integer.parseInt(args[1]);
            int division = d1 / d2;
            System.out.println("division=" + division);
        }catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("you gave non parsable int");
        }

        System.out.println("good bye");
    }//end of main
}
