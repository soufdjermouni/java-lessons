package com.lessons.integer.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class MainAtomicIntegerExample {

    private static AtomicInteger atomic = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerExample target = new AtomicIntegerExample();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        t1.start();
        t2.start();
        t3.start();

        long beg = System.nanoTime();
        for (int i = 0; i < Integer.MAX_VALUE / 5; i++) {
            incrementAtomicCounter();
        }
        System.out.println(System.nanoTime() - beg);
    }


    public static void incrementAtomicCounter() {
        atomic.getAndIncrement();
    }
}
