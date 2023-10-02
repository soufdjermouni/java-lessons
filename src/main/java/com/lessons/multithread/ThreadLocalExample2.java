package com.lessons.multithread;

public class ThreadLocalExample2 {

    private static ThreadLocal<String> threadLocalVariable = ThreadLocal.withInitial(() -> "Default Value");

    public static void main(String[] args) {
        // Set a thread-local variable for the current thread
        threadLocalVariable.set("Thread 1 Value");

        // Create and start a new thread
        Thread thread2 = new Thread(() -> {
            // Access the thread-local variable for this new thread
            System.out.println("Thread 2 Value: " + threadLocalVariable.get());// il prend la valeur initial : Default Value
        });
        thread2.start();

        // Access the thread-local variable for the main thread
        System.out.println("Main Thread Value: " + threadLocalVariable.get());
    }
}
