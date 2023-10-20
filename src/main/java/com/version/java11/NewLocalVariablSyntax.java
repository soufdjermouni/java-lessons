package com.version.java11;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class NewLocalVariablSyntax {

    public static void main(String[] args) {

        var str = new String("Value");
        System.out.println(str);

        BiFunction<Integer,Integer, Integer> function =  (var s1, var s2) -> Integer.sum(s1, s2);
        System.out.println(function.apply(2,2));

        Consumer<String> stringConsumer = (var s1) -> System.out.println(s1.toUpperCase());
        stringConsumer.accept("miniscule");//MINISCULE


    }
}
