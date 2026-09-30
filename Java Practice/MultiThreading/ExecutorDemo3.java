package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo3 {
    public static void main(String[] args) {

        ExecutorService executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2)
        );

        for (int i = 1; i <= 6; i++) {
            int curr = i;
            executor.execute( () -> {
                System.out.println(Thread.currentThread().getName() + " Executing Task "+ curr);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {}
            });
        }
        executor.shutdown();
    }
}