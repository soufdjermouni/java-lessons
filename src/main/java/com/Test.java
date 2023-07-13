package com;

public class Test {

    private static  Object obj;

    public static void main(String[] args) {

        //Concatenation starts from right to left. This property is known as Associativity in Java.
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);  //115110

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
