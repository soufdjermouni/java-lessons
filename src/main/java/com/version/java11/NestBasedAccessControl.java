package com.version.java11;

public class NestBasedAccessControl {
    private String name = "I'm Alphabet!";

    public class A {
        public void printName() {
            System.out.println(name);       // access Alphabet's private member!
        }
    }


}
