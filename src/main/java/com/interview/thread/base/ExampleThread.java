package com.interview.thread.base;

public class ExampleThread extends Thread {
    Test test;

    public ExampleThread(Test test){
        this.test = test;
    }

    @Override
    public void run() {
        test.increment();
    }
}