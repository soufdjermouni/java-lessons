package com;

public class Test {

    private static  Object obj;

    public static void main(String[] args) {

        String str = "EGC-C5-ETR";
        if(str.lastIndexOf("ETR") >1) {
            System.out.println("OK");
        } else {
            System.out.println("nonnnnnnn");
        }

        int Integer=10;
        System.out.println(Integer);//10
        System.out.println(obj);//null

    }
}
