package MultiThreading;

public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread is running...");

            try {
                // sleep() - pauses the current thread
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Main Thread was interrupted");
            }

            System.out.println("Thread finished");
        });


        // --------------------------------------------------
        // 1. setName()
        // --------------------------------------------------

        t1.setName("MyThread");

        // getName() - returns thread name
        System.out.println("Thread Name: " + t1.getName());
        //Thread Name: MyThread


        // --------------------------------------------------
        // 2. getId()  //its depricated now
        // --------------------------------------------------

        //System.out.println("Thread ID: " + t1.getId());


        // --------------------------------------------------
        // 3. getPriority()
        // --------------------------------------------------

        System.out.println("Default Priority: " + t1.getPriority());
        // Defaut Priority: 5


        // --------------------------------------------------
        // 4. setPriority()
        // --------------------------------------------------

        t1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("New Priority: " + t1.getPriority());
        //New Priority: 10


        // --------------------------------------------------
        // 5. isAlive()
        // --------------------------------------------------

        System.out.println("Before start: " + t1.isAlive());
        //Before start: false


        // --------------------------------------------------
        // 6. start()
        // --------------------------------------------------

        t1.start();

        System.out.println("After start: " + t1.isAlive());
        //After start: true


        // --------------------------------------------------
        // 7. join()
        // --------------------------------------------------

        // Main thread waits for t1 to finish
        t1.join();


        System.out.println("After join: " + t1.isAlive());
        // After join: false........bcz t1 completed its execution


        // --------------------------------------------------
        // 8. currentThread()
        // --------------------------------------------------

        Thread current = Thread.currentThread();

        System.out.println("Current Thread: " + current.getName()); //Current Thread: main


        // --------------------------------------------------
        // 9. getState()
        // --------------------------------------------------

        System.out.println("t1 Thread State: " + t1.getState()); //t1 Thread State: TERMINATED


        // --------------------------------------------------
        // 10. yield()
        // --------------------------------------------------

        Thread.yield();

        System.out.println("Main thread gave a chance to other threads");


        // --------------------------------------------------
        // 11. Daemon Thread - it runs until main thread terminates
        // --------------------------------------------------

        Thread daemonThread = new Thread(() -> {

            while (true) {
                System.out.println("Daemon Thread Running...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        // setDaemon() must be called before start()
        daemonThread.setDaemon(true);

        System.out.println("Is Daemon: " + daemonThread.isDaemon()); //Is Daemon: true

        daemonThread.start();


        // --------------------------------------------------
        // 12. interrupt()
        // --------------------------------------------------

        Thread t2 = new Thread(() -> {

            try {
                System.out.println("T2 is started and will sleep...");

                Thread.sleep(5000);

            } catch (InterruptedException e) {

                System.out.println("T2 was interrupted!");
            }
        });

        t2.start(); //T2 is started and will sleep...

        Thread.sleep(1000);

        // Interrupts the sleeping thread
        t2.interrupt(); //T2 was interrupted!
        //catch block runs bcz we interrupted sleeping method


        // --------------------------------------------------
        // 13. isInterrupted()
        // --------------------------------------------------

        Thread t3 = new Thread(() -> {

            System.out.println("T3 running...");
        });

        t3.start(); //T3 running...

        t3.join();

        System.out.println("T3 interrupted: " + t3.isInterrupted());
        // T3 interrupted: false


        // --------------------------------------------------
        // 14. Thread.interrupted()
        // --------------------------------------------------

        // Checks interruption status of CURRENT thread
        boolean interrupted = Thread.interrupted();

        System.out.println("Current thread interrupted: " + interrupted);
        // Current thread interrupted: false
    }
}