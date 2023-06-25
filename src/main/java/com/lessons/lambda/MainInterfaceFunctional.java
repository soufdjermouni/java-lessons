package com.lessons.lambda;

interface ExampleInterface {
    int getValue();
}
public class MainInterfaceFunctional {

    public static void main(String[] args) {
        ExampleInterface test = () -> 9;
        System.out.println(test.getValue()); // Output: 9
    }
}
