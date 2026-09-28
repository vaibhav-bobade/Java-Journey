package MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionLockDemo {
    public static void main(String[] args){
        ProducerConsumer2 pc = new ProducerConsumer2();

        Thread t1 = new Thread( () -> {
            for(int i = 1; i <= 10; i++){
                pc.produce(i);
            }
        });
        Thread t2 = new Thread( () -> {
            for(int i = 1; i <= 10; i++){
                pc.consume();
            }
        });

        t1.start();
        t2.start();
    }
}
class ProducerConsumer2{
    Lock lock = new ReentrantLock();
    Condition tobeFilled = lock.newCondition();
    Condition tobeEmpty = lock.newCondition();

    int data = 0;
    boolean filled = false;

    public void produce(int data){
        lock.lock();
        try{
            while(filled){
                tobeFilled.await();
            }
            this.data = data;
            filled = true;
            System.out.println("Produced: " + data);
            Thread.sleep(200);
            tobeEmpty.signal();
        }
        catch (InterruptedException e) {}
        finally{
            lock.unlock();
        }
    }
    public void consume(){
        lock.lock();
        try{
            while(filled == false){
                tobeEmpty.await();
            }
            System.out.println("Consumed: " + data);
            data = 0;
            filled = false;
            Thread.sleep(400);
            tobeFilled.signal();
        }
        catch (InterruptedException e) {}
        finally{
            lock.unlock();
        }
    }
}

/*
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Produced: 6
Consumed: 6
Produced: 7
Consumed: 7
Produced: 8
Consumed: 8
Produced: 9
Consumed: 9
Produced: 10
Consumed: 10
 */