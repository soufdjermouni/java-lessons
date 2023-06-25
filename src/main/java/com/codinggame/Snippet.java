package com.codinggame;

public class Snippet {

    public static void main(String[] args) {

        int i = 0;
        System.out.println(i++);//0
        System.out.println(i++);//1

        boolean b = true;
        boolean c = b ? !b:b;
        System.out.println(c);//false
    }
}
