package MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo4 {
    public static void main(String[] args) {
        System.out.println("1. schedule(param) method...");

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.schedule(
                () -> {
                    System.out.println("Task is Running after 2 seconds");
                },
                2,
                TimeUnit.SECONDS
        );
        try{
            Thread.sleep(2500);
        }
        catch (InterruptedException e){}


        System.out.println("---------------------------");

        System.out.println("2. scheduleAtFixedRate(param) method...");

        executor.scheduleAtFixedRate(
                () -> {
                    System.out.println("Task is Running...");
                },
                2,
                4,
                TimeUnit.SECONDS
        );

        //we will put main Thread to sleep so the above task should should repeat multiple times
        try{
            Thread.sleep(14500);
        }
        catch (InterruptedException e){}

        System.out.println("----------------------------");

        System.out.println("3. scheduleWithFixedDelay(param) method...");

        executor.scheduleWithFixedDelay(
                () -> {
                    System.out.println("Task is Running...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Task Finished.");
                },
                2,
                4,
                TimeUnit.SECONDS
        );
        //we will again put main thread to sleep to execute this delaying tasks
        try{
            Thread.sleep(17000);
        }
        catch (InterruptedException e){}

        executor.shutdown();
    }
}