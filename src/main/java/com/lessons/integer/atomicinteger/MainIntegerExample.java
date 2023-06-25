package com.lessons.integer.atomicinteger;

public class MainIntegerExample {

    public static void main(String[] args) {

        IntegerExample targeti = new IntegerExample();
        Thread t1i = new Thread(targeti);
        Thread t2i = new Thread(targeti);
        Thread t3i = new Thread(targeti);
        t1i.start();
        t2i.start();
        t3i.start();
    }
}
