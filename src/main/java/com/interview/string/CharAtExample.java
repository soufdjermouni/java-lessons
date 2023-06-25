package com.interview.string;

public class CharAtExample {

    public static void main(String[] args) {

        String hello = "hello";
        char cr = hello.charAt(0);
        Character crWraper = hello.charAt(2);
        System.out.printf(String.valueOf(cr));
        System.out.println(crWraper);

    }
}
