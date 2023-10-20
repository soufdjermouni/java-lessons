package com.version.java16;

import org.springframework.util.concurrent.MonoToListenableFutureAdapter;

import java.util.concurrent.Future;

public class New1DemoLocalEnum {

    public static void main(String[] args) {
        demoLocalEnum();
    }

    private static void demoLocalEnum()
    {
        enum Color { PURPLE, SAFETY_ORANGE }
        System.out.println( Color.PURPLE );
    }
}
