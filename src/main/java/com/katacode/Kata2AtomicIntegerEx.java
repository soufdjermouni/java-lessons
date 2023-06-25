package com.katacode;

import java.util.concurrent.atomic.AtomicInteger;

public class Kata2AtomicIntegerEx {
    public static void main(String[] args) {

        //Tester différents méthod
        AtomicInteger someInt = new AtomicInteger(0);
        int f = someInt.getAndAdd(10);//0
        int j = someInt.get(); //10
        int k = someInt.addAndGet(10); //20

        System.out.println(f+" "+j+" "+k);
        System.out.println(someInt.incrementAndGet());


        //Exempel incrémentation
        AtomicInteger atomic = new AtomicInteger(0);
        int i = 0;

        int x = 10;
        int y;

        y = atomic.get(); //est équivalent à y = i;
        y = atomic.incrementAndGet();// est équivalent à y = ++i;
        y = atomic.getAndIncrement(); //est équivalent à y = i++;
        y = atomic.decrementAndGet(); //est équivalent à y = --i;
        y = atomic.addAndGet(x);// est équivalent à i = i + x; y = i;
        y = atomic.getAndAdd(x); // est équivalent à y = i; i = i + x;
        atomic.set(x); //est équivalent à i = x;
        y = atomic.getAndSet(x);// est équivalent à y = i; i = i + x;

    }
}
