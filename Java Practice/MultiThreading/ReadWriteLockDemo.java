package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedResources sr = new SharedResources();

        Thread t1 = new Thread( () -> sr.read());
        Thread t2 = new Thread( () -> sr.read());
        Thread t3 = new Thread( () -> sr.write(5));
        Thread t4 = new Thread( () -> sr.read());
        Thread t5 = new Thread( () -> sr.read());
        Thread t6 = new Thread( () -> sr.write(10));
        Thread t7 = new Thread( () -> sr.read());
        Thread t8 = new Thread( () -> sr.read());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
class SharedResources{
    private int data = 0;

    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock readLock = lock.readLock();
    Lock writeLock = lock.writeLock();

    public void read(){
        readLock.lock();
        try{
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}
            System.out.println( Thread.currentThread().getName() + " reads " + data);
        }
        finally{
            readLock.unlock();
        }
    }
    public void write(int data){
        writeLock.lock();
        try{
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){}
            this.data = data;
            System.out.println( Thread.currentThread().getName() + " writes " + data);
        }
        finally{
            writeLock.unlock();
        }
    }
}

/*
Thread-5 writes 10
Thread-7 reads 10
Thread-0 reads 10
Thread-6 reads 10
Thread-1 reads 10
Thread-2 writes 5
Thread-4 reads 5
Thread-3 reads 5
 */