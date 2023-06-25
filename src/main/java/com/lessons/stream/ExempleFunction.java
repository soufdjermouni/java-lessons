package com.lessons.stream;

import java.util.stream.Stream;

public class ExempleFunction {

    public static void main(String[] args) {

        Stream.of(1,2,3).forEach(ExempleFunction::printNumber);


        Stream.of(4,5,6).forEach(n -> printNumber(n));

    }
    public static void printNumber(int n){
        System.out.println(n);
    }
}
