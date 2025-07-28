package study.generics;

public class UserOfStack {

    public static void main(String[] args) {
        Stack1 s=new Stack1();

       // s.showStack();
        s.push("red");
        s.push("blue");
        s.push("green");

        s.showStack();
        System.out.println(s.pop());
        s.showStack();
    }
}
