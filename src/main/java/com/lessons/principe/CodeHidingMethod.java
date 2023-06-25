package com.lessons.principe;

class Parent {
    public static void sleep() {
        System.out.println("Sleeps at 11 PM");
    }
}
class Child extends Parent {
    public static void sleep() {
        System.out.println("Sleeps at 9 PM");
    }
}

/**
 * we assume that p.sleep() will call the sleep() method from the Parent class and c.sleep() will call the sleep()
 * method from the Child class, just as in overriding, but because sleep() is a static function, we have hidden the
 * sleep() method rather than overriding it.
 */
public class CodeHidingMethod {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        p.sleep();//Sleeps at 11 PM
        c.sleep();//Sleeps at 11 PM
    }
}
