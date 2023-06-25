package com.interview.string;

//The straightforward ways to concatenate Strings are the + operator and the concat method. Let's try one example to illustrate both ways.

public class TestEquals {

    public static void main(String[] args) {

        String hello = "Hello";
        String world = " World";
        hello.concat(world);

        String helloWorld1 = "Hello World";
        String helloWorld2 = new String("Hello World");
        String helloWorld3 = new StringBuilder("Hello World").toString();
        String helloWorld4 = "Hello World";

        System.out.println(hello.equals(helloWorld1)); // false
        System.out.println(helloWorld3.equals(helloWorld1)); // true
        System.out.println(helloWorld1 == helloWorld2); // false
        System.out.println(helloWorld3 == helloWorld2); // false
        System.out.println(helloWorld1 == helloWorld4); // true
    }
}
