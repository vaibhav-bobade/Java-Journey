package MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args){

        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync( () -> 2)
                .thenApply( x -> x*x)
                .thenApply(x -> x*x);

        if(cf1.isDone()){
            try {
                System.out.println( "cf1 provided: " + cf1.get());
            } catch (Exception e) {}
        }

        CompletableFuture<Void> cf2 = CompletableFuture.runAsync( () -> {
            System.out.println("Executed through runAsync ");
        });

        CompletableFuture<Void> cf3 = CompletableFuture.supplyAsync( () -> 5)
                .thenApply(x -> x*x)
                .thenAccept( x -> System.out.println(x));

        CompletableFuture<Integer> cf4 = CompletableFuture.supplyAsync( () -> 5)
                .thenApply(x -> x*x);

        cf1.thenCombine(cf4, (a,b) -> a+b)
                .thenAccept( System.out::println);
    }
}

/*
cf1 provided: 16
Executed through runAsync
25
41
 */