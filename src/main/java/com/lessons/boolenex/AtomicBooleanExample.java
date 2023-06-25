package com.lessons.boolenex;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {

    public static void main(String[] args) {

        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        System.out.println(atomicBoolean.get());//false
        atomicBoolean.set(true);

        System.out.println(atomicBoolean.getAndSet(false)); //true
        System.out.println(atomicBoolean.get());//false

        //Exemple : not thread safe
        boolean initialized = false;
        if (!initialized) {
            initialize();
            initialized = true;
        }
        System.out.println("initialized="+initialized);

        //Exemple :  thread safe
        AtomicBoolean atomicInitialized = new AtomicBoolean(false);
        if (atomicInitialized.compareAndSet(false, true)) {
            initialize();
        }
        System.out.println("atomicInitialized="+atomicInitialized);
    }

    private static void initialize() {
        //
    }

}
