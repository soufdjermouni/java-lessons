package com.lessons.interfacefonctionnelle.biconsumer;

import java.util.function.BiConsumer;

/**
 * L'interface fonctionnelle  : BiConsumerExample
 *
 * @FunctionalInterface
 * public interface BiConsumer<T, U> {
 *
 * void accept(T t,U u);
 *
 */
public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String,Integer> bc =
                (String s, Integer i) -> System.out.println(s+ "-" + i);
        bc.accept("Student", 1);

    }
}
