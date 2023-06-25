package com.lessons.asynchronousprogramming;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws Exception{

        /**
         * Creates an Executor that uses a single worker thread operating off an unbounded queue.
         * Tasks are guaranteed to execute sequentially, and no more than one task will be active at any given time.
         * Unlike the otherwise equivalent newFixedThreadPool(1) the returned executor is guaranteed not to be
         * reconfigurable to use additional threads.
         */
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(new MyCallable());

        System.out.println(f.isDone()); //False

        System.out.println(f.get()); //Waits until the task is done, then prints 1
        System.out.println("to be continued");
    }

    /**
     * A task that sleeps for a second, then returns 1
     **/
    public static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(10000);
            return 1;
        }

    }
}
