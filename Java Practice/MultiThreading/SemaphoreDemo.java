package MultiThreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo{
    public static void main(String[] args) {
        PermitAccess pa =new PermitAccess();

        Thread t1 = new Thread( () -> pa.aceess());
        Thread t2 = new Thread( () -> pa.aceess());
        Thread t3 = new Thread( () -> pa.aceess());
        Thread t4 = new Thread( () -> pa.aceess());
        Thread t5 = new Thread( () -> pa.aceess());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
class PermitAccess{
    private final Semaphore s = new Semaphore(2, true);
    public void aceess(){
        try {
            s.acquire();
            System.out.println(Thread.currentThread().getName() + " Aquired Access");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " Released Access");
            s.release();
        }
    }
}
/*
Thread-0 Aquired Access
Thread-1 Aquired Access
Thread-0 Released Access
Thread-2 Aquired Access
Thread-1 Released Access
Thread-3 Aquired Access
Thread-2 Released Access
Thread-4 Aquired Access
Thread-3 Released Access
Thread-4 Released Access
 */