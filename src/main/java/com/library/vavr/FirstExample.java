package com.library.vavr;

import java.util.function.BiFunction;

public class FirstExample {
    public static void main(String[] args) {
        //BiFunction
        BiFunction<Integer, Integer, Integer> sum =
                (num1, num2) -> num1 + num2;
        int result = sum.apply(5, 7);

        System.out.println(result);
    }

}
