public class TestPoly {
    public static void main(String[] args) {
       // A obj = new A();
        //test(obj);
       //test( new B());
       // A obj2 = new B();
        //test(obj2);
        B obj3 = new B();
        test(obj3);
    }

    static void test(A obj)  //obj  compile time it is A , run time it is B
    {
        System.out.println("run time:"+obj.getClass());
        obj.f1();   //always call the f1 of run time object
    }
}//end of class

class A
{
      void fA()
      {
          System.out.println("fA");
      }

      void f1()
      {
          System.out.println("in f1 of A");
      }
}//end of class A

class B extends A
{
    @Override
    void f1() {
        System.out.println("in f1 of B");
    }
} //end of class B