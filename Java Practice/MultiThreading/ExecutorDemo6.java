package MultiThreading;

import java.util.concurrent.*;

public class ExecutorDemo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<Integer> f1 = executor.submit( () -> {
            Thread.sleep(1900);
            return 10;
        });

        // .isDone() return boolean telling that execution is completed or not
        System.out.println("Does f1 completed process: " + f1.isDone());

        //.get(timeout, unit) it waits for this specified time and after not getting result it will throw Exception
        Integer num = f1.get(2, TimeUnit.SECONDS);
        System.out.println("f1 produced: " + num);


        Future<Integer> f2 = executor.submit( () -> {
            Thread.sleep(2000);
            return 20;
        });

        // .cancel(boolean mayInterruptIfRunning) it will cancel the process if its not running
        // if we provide true in that it will interrupt the running process
        // and if we provide false in that it will let process to finish its task if its running else cancel
        f2.cancel(true);

        // .isCancelled() will give boolean telling whether process is cancelled or not
        System.out.println("Is f2 cancelled: " + f2.isCancelled());

        executor.shutdown();
    }
}

/*
Does f1 completed process: false
f1 produced: 10
Is f2 cancelled: true
 */