package com.lessons.multithread;

/**
 * Correct Answer is "Thread[main,5,main]"
 * Explanation: When we try to print the Object of Thread class, then it will call the overridden toString method.
 * There it'll check if the thread belongs to some group or not. If it belongs to some group, then it'll print these
 * three values.
 *
 *  1st: Thread Name
 *   2nd: Priority of Thread
 *      3rd: Group of thread
 *
 * In this case, it is the Main Thread which belongs to main thread group also. And by default, the thread priority is 5.
 */
public class ThreadExample {

    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println(t);//Thread[main,5,main]
    }
}
