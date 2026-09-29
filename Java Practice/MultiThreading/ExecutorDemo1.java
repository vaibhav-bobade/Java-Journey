package MultiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo1 {
    public static void main(String[] args) {

        //ExecutorService is an Interface and it Extends Executor(which has only one method,
        // void execute(Runnable r)
        //but ExecutorService has so many methods

        ExecutorService executor = Executors.newFixedThreadPool(2);
        //we initialized 2 threads so they will perform our all tasks one after another
        //Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue.
        // At any point, at most nThreads threads will be active processing tasks.

        executor.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " is running for 5 seconds");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        });
        executor.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " is running for 2 seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        });
        executor.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " is running for 5  seconds");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
        });
        executor.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " is running for 2 seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        });

        // submit method is similar as execute but difference is submit takes Callable and execute takes Runnable
        // public void execute( Runnable task )  returns void
        // public <T> submit( Callable task )  returns something
        // Callable returns Future, so we need to store value in Future
        // Future waits until submit gives it a value or exception

        Future<Integer> num = executor.submit( () -> {
            try{
                System.out.println(Thread.currentThread().getName() + " will sleep for 5 seconds");
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {}
            return 10;
        });
        try{
            System.out.println(num.get());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        executor.shutdown();
    }
}