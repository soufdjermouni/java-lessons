package com.katacode.Month102023;

public class Kata06102023StaticBlock {
    static {
        System.out.println("Static Block 1");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static {
        System.out.println("Static Block 2");
    }

    //The output :
    //Static Block 1
    //Static Block 2
    //Main Method
}
