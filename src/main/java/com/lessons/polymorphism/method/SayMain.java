package com.lessons.polymorphism.method;

/**
 * Method overriding is when we define multiple methods with the same name, same signature, and return type in order to “ignore” the previously
 * defined methods in a parent class or interface.
 *
 * Overriding is not limited to methods as it can also be applied to attributes of a class.
 */
public class SayMain {

    public static void main(String[] args) {


        John john = new John("John", "Smith");
        John jane = new John("Jane", "Doe", 25);

        john.sayHello("John", 30);
        jane.sayHello("Jane");
    }
}
