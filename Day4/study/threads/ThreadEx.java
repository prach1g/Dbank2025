
package study.threads;
public class ThreadEx {

    public static void main(String[] args) {

        Thread curr = Thread.currentThread();
        System.out.println("The name of current thread is "+curr.getName());
        sayHello();
        sayBye();
    }//end of main

    static  void sayHello(){
        while(true){
            System.out.println("Hello "+Thread.currentThread().getName());
        }
    }//end of sayHello

    static void sayBye(){
        while(true){
            System.out.println("bye"+Thread.currentThread().getName());
        }
    }//end sayBye

}//end of class
