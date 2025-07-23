public class ExceptionsEx {

    public static void main(String[] args) {
        try {
            try {
                m1();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("some problem occured");
        }
        finally
        {
            System.out.println("finally runs");
        }
        System.out.println("good-bye");

    }

    static void m1() throws Exception
    {
        m2();
    }

    static void m2() throws Exception
    {
        System.out.println("m2 doing a task");
        throw new Exception();
    }

}
