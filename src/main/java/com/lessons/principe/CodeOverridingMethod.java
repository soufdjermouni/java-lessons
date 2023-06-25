package com.lessons.principe;

/**
 * In this example, both the superclass and the subclass have methods with the same signature (method name and parameters),
 * and when we try to invoke this method from the subclass, the sub-class method overrides the method in the superclass and is executed.
 */
class Super {
    public void sample() {
        System.out.println("Method of the Super class");
    }
}
public class CodeOverridingMethod extends Super {
    public void sample() {
        System.out.println("Method of the Sub class");
    }
    public static void main(String args[]) {
        CodeOverridingMethod obj = new CodeOverridingMethod();
        obj.sample();//Method of the Sub class"
    }
}

