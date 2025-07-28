package study.generics;

public class User2 {
    public static void main(String[] args) {
        //Integer is Actual Type Parameter
        GenericStack<Integer> g=new GenericStack<>(new Integer[5]);
        g.push(10);
        g.push(13);
        g.push(14);
        g.showStack();

        int sum=0;
        while(true){
            Integer x = g.pop();
            if(x!=null){
                sum=sum+x;
            }else {
            break; }

        }
        System.out.println("sum="+sum);

    }
}
