package study.inheritance;

public class LambdaEx {
    public static void main(String[] args) {

        //Impl1
        Calculator obj1 = new CalcImpl();
        System.out.println(obj1.calculate(12,12));

        //Impl2
        Calculator  obj2 =  (int a, int b)->{return a*b;};
        System.out.println(obj2.calculate(12,12));

        //Impl3
        Calculator obj3 = (int a, int b)-> a-b;
        System.out.println(obj3.calculate(12,12));

        //CALL doJob using obj1 , obj2 and obj3  and observe output

        //Impl4
        doJob((a,b)->{return a/b;});  //call to doJob and pass lambdd
    }

    //definition
    static void doJob(Calculator obj){
        System.out.println("doJob :  "+obj.calculate(12,12));
    }


}//end of class


@FunctionalInterface
interface Calculator
{
    public int calculate(int a, int b);
}

class CalcImpl implements Calculator{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
