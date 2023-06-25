package com.lessons.enumexample;

public class TestEnum {
    public static void main(String[] args) {

        System.out.println(Planet.MERCURY == Planet.MERCURY);//true
        System.out.println(Planet.MERCURY == Planet.VENUS);//false
        System.out.println(Planet.MERCURY.equals(Planet.MERCURY));//true
    }
}
