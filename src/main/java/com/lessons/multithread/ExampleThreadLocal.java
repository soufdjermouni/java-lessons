package com.lessons.multithread;

public class ExampleThreadLocal implements Runnable{

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public void run() {
        int value = threadLocal.get();
        value++;
        threadLocal.set(value);

        System.out.println("Thread " + Thread.currentThread().getId() + ": " + value + " " + threadLocal.get());
    }

    public static void main(String[] args) {
        ExampleThreadLocal thread = new ExampleThreadLocal();
        thread.run();
    }
}
