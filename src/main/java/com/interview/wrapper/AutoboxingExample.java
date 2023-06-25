package com.interview.wrapper;

public class AutoboxingExample {
    public static void main(String[] args) {
        int a=20;
        Integer i = Integer.valueOf(a);//converting int into Intger explicity
        Integer j = a; //autoboxing
        System.out.println(a + " " + i + " " + j);

        Character ch = 'a';
        char c = ch;//unboxing
        System.out.println(a);

    }
}
