package com.interview.algorithm.chaine;

public class StringBuilderInverseChaine {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
