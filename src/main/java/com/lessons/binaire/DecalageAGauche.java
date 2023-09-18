package com.lessons.binaire;

public class DecalageAGauche {

    public static void main(String[] args) {
        int a = 5;         // 00000000000000000000000000000101
        int b = 2;
        System.out.println(5<<2);//20

        //2 = 00000010
        //2 = 00000001
        System.out.println(2<<1);//4

        //2 = 00000010
        //2 = 00000011
        System.out.println(2<<3);//16 = 00000010000
    }
}
