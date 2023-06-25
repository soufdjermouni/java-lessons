package com.lessons.thread.semaphore;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Un AtomicInteger contient un champ volatile:
 *
 */
public class ThreadSafeCounterWithAtomicInteger {

    private final AtomicInteger counter =
            new AtomicInteger();
    public int nextValue() {
        return counter.getAndIncrement();
    }

}
