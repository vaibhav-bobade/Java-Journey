package MultiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorDemo5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //We can use submit() method in 3 ways
        //1. submit(Runnable task)
        executor.submit( () -> {
            System.out.println(Thread.currentThread().getName() + " is running through submit(Runnable r)");
        });

        //2. submit(Callable task)
        Future<String> s2 = executor.submit( () -> {
            System.out.println(Thread.currentThread().getName() + " is running through submit(Callable c)");
            return "Callable Result";
        });
        System.out.println(s2.get());

        //3. submit(Runnable task, T result)
        Future<String> s3 = executor.submit( () -> {
            System.out.println(Thread.currentThread().getName() + " is running through submit(Runnable r, T result)");
        }, "Task Completed");

        System.out.println(s3.get());

        executor.shutdown();
    }
}

/*
pool-1-thread-1 is running through submit(Runnable r)
pool-1-thread-2 is running through submit(Callable c)
Callable Result
pool-1-thread-3 is running through submit(Runnable r, T result)
Task Completed
 */