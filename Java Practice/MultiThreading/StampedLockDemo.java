package MultiThreading;

import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {
    public static void main(String[] args){

        SimpleStampedLockExample stLock = new SimpleStampedLockExample();

        Thread t1 = new Thread( () -> stLock.getValue());
        Thread t2 = new Thread( () -> stLock.setValue(20));
        Thread t3 = new Thread( () -> stLock.getValue());
        Thread t4 = new Thread( () -> stLock.setValue(30));
        Thread t5 = new Thread( () -> stLock.getValue());
        Thread t6 = new Thread( () -> stLock.getValue());
        Thread t7 = new Thread( () -> stLock.getValue());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
class SimpleStampedLockExample {
    private int value = 10;
    private final StampedLock lock = new StampedLock();

    // 1. Write Lock: Updates the value exclusively
    public void setValue(int newValue) {
        long stamp = lock.writeLock();
        try {
            value = newValue;
            System.out.println("Writer updated value to: " + newValue);
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    // 2. Optimistic Read with Fallback
    public void getValue() {
        // Try optimistic read (doesn't block writers)
        long stamp = lock.tryOptimisticRead();
        int currentVal = value;

        // Check if a write happened while we were reading
        if (!lock.validate(stamp)) {
            // If validation failed, fall back to a standard read lock
            stamp = lock.readLock();
            try {
                currentVal = value;
                System.out.println("Reader used Fallback Read Lock. Reads " +  currentVal);
            } finally {
                lock.unlockRead(stamp);
            }
        } else {
            System.out.println("Reader used Optimistic Read (fast path!). Reads " +  currentVal);
        }

    }
}

/*
Reader used Optimistic Read (fast path!). Reads 10
Writer updated value to: 20
Reader used Optimistic Read (fast path!). Reads 20
Writer updated value to: 30
Reader used Fallback Read Lock. Reads 30
Reader used Optimistic Read (fast path!). Reads 30
Reader used Optimistic Read (fast path!). Reads 30
 */