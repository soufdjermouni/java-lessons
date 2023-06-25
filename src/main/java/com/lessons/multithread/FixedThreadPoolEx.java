package com.lessons.multithread;

import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolEx implements Runnable {

    private int taskId;

    public FixedThreadPoolEx(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task : %s is running in %s".formatted(taskId, Thread.currentThread().getName()));
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executor.submit(new FixedThreadPoolEx(i));
        }
        executor.shutdown();
    }

    //Sortie
   /** Task : 1 is running in pool-1-thread-2
    Task : 2 is running in pool-1-thread-3
    Task : 0 is running in pool-1-thread-1
    Task : 3 is running in pool-1-thread-2
    Task : 5 is running in pool-1-thread-1
    Task : 4 is running in pool-1-thread-3
    Task : 7 is running in pool-1-thread-1
    Task : 8 is running in pool-1-thread-3
    Task : 6 is running in pool-1-thread-2
    Task : 9 is running in pool-1-thread-1 */
}
