package com.lessons.runtime;

public class StaicMethodHelloWorld {
        static {
            System.out.println("in static");
        }
        public static void main(String[] args) {
            System.out.println("in main");
        }
    }
