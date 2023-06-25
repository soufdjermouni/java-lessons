package com.lessons.lambda.lambdaex1;

@FunctionalInterface //Because the interface Printable has one abstract method
public interface Printable {
    void print(); //Abstract method , because has no implemntation

    //void doThing(); => Multiple non-overriding abstract methods found in interface com.lessons.lambda.lambdaex1.Printable
}
