public class CrashEx {

    public static void main(String[] args) {
        int d1 = 1;
        int d2 =1;
        try {
              d1 = Integer.parseInt(args[0]);
             d2 = Integer.parseInt(args[1]);
         }catch(NumberFormatException nfe)
         {
             System.out.println("you gave non parsable int");
         }
        try {
            int division = d1 / d2;
            System.out.println("division=" + division);
        }catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }

        System.out.println("good bye");
    }//end of main
}
