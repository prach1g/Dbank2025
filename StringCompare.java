public class StringCompare {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        //if(s3==s4)
        //if(s1==s2)
        //if(s1 == s4)
       // if(s1.equalsIgnoreCase(s3))
        if(s1.equals(s3))
            System.out.println("they are same");
        else
            System.out.println("they are different");

    }
}
