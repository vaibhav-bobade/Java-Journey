package MultiThreading;

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); //Thread is Running by Extending Thread Class

        MyTask t2 = new MyTask();
        Thread thread = new Thread(t2);
        thread.start(); //Thread is Running by Implementing Runnable Interface

        //Runnable interface is Functional Interface
        //so we can create thread with the help of Lambda Expression
        Thread t3 = new Thread(() -> System.out.println("Thread created by Lambda Expression"));
        t3.start();
    }
}

//by extending Thread Class
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running by Extending Thread Class");
    }
}

//by Implementing Runnable Interface
class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is Running by Implementing Runnable Interface");
    }
}