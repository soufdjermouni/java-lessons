package com.lessons.integer.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample implements  Runnable{
    private static AtomicInteger atomic = new AtomicInteger(0);

    @Override
    public void run() {
        System.out.println("AtomicIntegerExample_"+Thread.currentThread().getName() + "# " +
                atomic.getAndIncrement());
    }
}


