package MultiThreading;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorDemo2{
    public static void main(String[] args) {

        List<Callable<Integer>> tasks = List.of(
                () -> 10,
                () -> 20,
                () -> 30,
                () -> 40
        );
        //submit returns future so, List<Callable> has submit lambdas that will return List<Future>

        ExecutorService executor = Executors.newFixedThreadPool(1);

        List<Future<Integer>> futures;
        try {
            futures = executor.invokeAll(tasks);
            for (Future<Integer> f : futures) {
                Thread.sleep(1000);
                System.out.println( f.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
    }
}

/*
10
20
30
40
 */