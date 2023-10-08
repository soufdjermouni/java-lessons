package com.katacode;

public class Kata05102023Complex {

    public static void main(String[] args) {
        int x = 5; int y = 7;
        int z = x++ + ++y - --x + y--;
        System.out.println(z);//16
    }
}
