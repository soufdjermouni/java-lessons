package com.lessons.thread.semaphore;

/**
 * le code est thread-safe mais pas très rapide
 *
 */
public class ThreadSafeCounter {

    private final Object lock = new Object();
    private int counter;

    public int nextValue() {
        synchronized (lock) {
            return counter++;
        }
    }

}
