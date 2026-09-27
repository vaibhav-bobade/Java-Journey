package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {
    public static void main(String[] args) {
        ReentrantLockD1 re1  = new ReentrantLockD1();

        Thread t1 = new Thread(re1::method1);
        Thread t2 = new Thread(re1::method1);
        Thread t3 = new Thread(re1::method1);
        Thread t4 = new Thread(re1::method1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class ReentrantLockD1 {
    Lock lock1 = new ReentrantLock();

    void method1() {
        try {
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " is Working..");
            try {
                Thread.sleep(400);
                method2();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is Interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " Work Completed..\n");
        }
        finally {
            lock1.unlock();
        }
    }
    void method2() {
        try {
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " Entered in method 2");
            System.out.println(Thread.currentThread().getName() + " Left method 2");
        }
        finally {
            lock1.unlock();
        }
    }
}
/*
Thread-1 is Working..
Thread-1 Entered in method 2
Thread-1 Left method 2
Thread-1 Work Completed..

Thread-2 is Working..
Thread-2 Entered in method 2
Thread-2 Left method 2
Thread-2 Work Completed..

Thread-3 is Working..
Thread-3 Entered in method 2
Thread-3 Left method 2
Thread-3 Work Completed..

Thread-0 is Working..
Thread-0 Entered in method 2
Thread-0 Left method 2
Thread-0 Work Completed..
 */