package com.interview.integer;

public class Comparison {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); //True

        Integer i3 = 128;
        Integer i4 = 128;
        // Integer cache value from -128 to 127. And outside create objects
        System.out.println(i3 == i4);  //false

        //I don’t recommend to youse == for object comparison in Java
        Integer i5 = Integer.valueOf(128);
        Integer i6 = Integer.valueOf(128);
        System.out.println(i5.equals(i6));  //true


        int i7 = 128;
        int i8 = 128;
        System.out.println(i7 == i8);  //true


    }
}
