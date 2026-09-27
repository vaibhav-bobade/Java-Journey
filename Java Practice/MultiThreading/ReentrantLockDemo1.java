package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {
    public static void main(String[] args) {

        ReentrantLockD2 re2  = new ReentrantLockD2();

        Thread t1 = new Thread(re2::proceed);
        Thread t2 = new Thread(re2::proceed);
        Thread t3 = new Thread(re2::proceed);
        Thread t4 = new Thread(re2::proceed);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class ReentrantLockD2 {
    Lock lock1 = new ReentrantLock();

    void proceed() {
        try {
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " is Working..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is Interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " Work Completed..");
        }
        finally {
            lock1.unlock();
        }
    }
}
/*
Thread-0 is Working..
Thread-0 Work Completed..
Thread-1 is Working..
Thread-1 Work Completed..
Thread-2 is Working..
Thread-2 Work Completed..
Thread-3 is Working..
Thread-3 Work Completed..
 */