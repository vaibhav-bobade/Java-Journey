package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class  AtomicIntegerDemo {
    public static void main(String[] args) {
        System.out.println("Program started...");
        AtomicIntDemo aid = new AtomicIntDemo();
        Thread t1 = new Thread( () -> {
            for(int i = 1; i <= 10000; i++){
                aid.increment();
            }
        });
        Thread t2 = new Thread( () -> {
            for(int i = 1; i <= 10000; i++){
                aid.increment();
            }
        });
        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){}

        System.out.println("Count is " + aid.getCount());
        System.out.println("Program ended...");
    }
}
class AtomicIntDemo{
    AtomicInteger count = new AtomicInteger(0);
    public void increment(){
        count.incrementAndGet();
    }
    int getCount (){
        return count.get();
    }
}