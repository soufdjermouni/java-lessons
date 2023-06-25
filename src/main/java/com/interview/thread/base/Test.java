package com.interview.thread.base;

public class Test {
    public volatile int num;
    public void increment(){
        num++;
        System.out.println("Result is " + num);
    }

    public static void main(String a[]) {
        Test test = new Test();
        ExampleThread exampleThread1 = new ExampleThread(test);
        ExampleThread exampleThread2 = new ExampleThread(test);

        //Not Predictable , Result is 1 Result is 2 , or Result is 2 Result is 1
        exampleThread1.start();
        exampleThread2.start();
    }
}

