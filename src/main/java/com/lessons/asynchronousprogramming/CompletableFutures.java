package com.lessons.asynchronousprogramming;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * CompletableFutures were introduced in Java 8 (2014). They are in fact an evolution of regular Futures, inspired by
 * Google's Listenable Futures, part of the Guava library. They are Futures that also allow you to string
 * tasks together in a chain. You can use them to tell some worker thread to "go do some task X, and when
 * you're done, go do this other thing using the result of X". Using CompletableFutures, you can do
 * something with the result of the operation without actually blocking a thread to wait for the result.
 * Here's a simple example:
 */
public class CompletableFutures {

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        CompletableFuture<Integer> f = CompletableFuture.supplyAsync(new MySupplier(), exec);
        System.out.println(f.isDone()); // False
        CompletableFuture<Integer> f2 = f.thenApply(new PlusOne());
        System.out.println(f2.get()); // Waits until the "calculation" is done, then prints 2
    }

    /**
     * A supplier that sleeps for a second, and then returns one
     **/
    public static class MySupplier implements Supplier<Integer> {

        @Override
        public Integer get() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //Do nothing
            }
            return 1;
        }
    }

    /**
     * A (pure) function that adds one to a given Integer
     **/
    public static class PlusOne implements Function<Integer, Integer> {

        @Override
        public Integer apply(Integer x) {
            return x + 1;
        }
    }
}
