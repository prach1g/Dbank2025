package study.threads;

public class ThreadExample2 {
    public static void main(String[] args) {
            SayHiThread sayHiThread = new SayHiThread();
            SayByeThread sayByeThread = new SayByeThread();
            //DONT CALL run -  IT will called automatically when the thread runs
            sayHiThread.start();  //add the thread to ready queue
            sayByeThread.start();   //add the thread to ready queue

            SayHelloThread sayHellorunnable = new SayHelloThread();
            Thread th1 = new Thread(sayHellorunnable);
            th1.start();

            //Lambda notation
        Runnable sayGoodDayrunnable = ()-> { //PATH BEGINS
            for (int i = 0; i < 10; i++) {
                System.out.println("GoodDay " + i + " " + Thread.currentThread().getName());
            }};

            Thread th2 = new Thread(sayHellorunnable);
            th2.start();

        }




}//end of Main class


class SayHiThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Hi ..."+Thread.currentThread().getName());
        }
    }//end of run  = alternate path of execution
}

class SayByeThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
           System.out.println("Bye ..."+Thread.currentThread().getName());
       }
    }//end of run  = alternate path of execution
}


class SayHelloThread implements Runnable{

    @Override
    public void run() { //PATH BEGINS
        for(int i=0;i<10;i++){
            System.out.println("Hello World"+i+ " "+Thread.currentThread().getName());
        }
    }//PATH ENDS
}







