package com.lessons.interfacefonctionnelle.function;

import java.util.function.Function;

/**
 *
 * @FunctionalInterface
 * public interface Function<T, R> {
 *
 * R apply(T t);
 *
 */
public class IFFunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> length =
            s -> s.length();

        Function<String, Integer> length2 =
                String::length;

        int l = length.apply("Bonjour");
        System.out.println(l);//7
    }

}
