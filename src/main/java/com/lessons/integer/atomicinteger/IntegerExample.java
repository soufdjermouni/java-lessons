package com.lessons.integer.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerExample implements  Runnable{
    private static Integer atomic = Integer.valueOf(0);

    @Override
    public void run() {
        System.out.println("IntegerExample_"+Thread.currentThread().getName() + "# " +
                atomic++);
    }
}


