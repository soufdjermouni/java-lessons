package com.interview.thread.finalize;

//Result : main
//String class Finalize method will be called not JavaExample class Finalize method
public class JavaExample {

    //finalize : not clalling
    // Yes, that's right. In the same way, if we create an object of the JavaExample class, then the overridden
    // finalize method will be called.
    public static void main(String[] args) throws InterruptedException {
        String str = new String("Java Developers Community");
        str = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("main");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }
}
