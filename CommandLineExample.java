public class CommandLineExample {

    public static void main(String[] args) {
        for (int i=0;i<args.length;i++)
        {
            //int x = Integer.parseInt(args[i]);
            //double d =Double.parseDouble(args[i]);
            //Extract the boolean value from the string
            boolean b = Boolean.parseBoolean(args[i]);
            if(b==true)
                System.out.println("haha");
            else
                System.out.println("byebye");
        }
    }
}
