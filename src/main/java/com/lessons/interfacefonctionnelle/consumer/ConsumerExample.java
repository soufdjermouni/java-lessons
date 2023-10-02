package com.lessons.interfacefonctionnelle.consumer;

import java.util.function.Consumer;

/**
 * @FunctionalInterface
 * public interface Consumer<T> {
 *
 * void accept(T t);
 *
 */
public class ConsumerExample {

    public static void main(String[] args) {
        //Une expression lambda est une implementation d'une interface fonctionnelle.

        //1- un cosnumer est une interface paramétré avec une method accept(T t)
        Consumer<String> cons = (String s) -> {
            System.out.println(s); //Lambda can be replaced with method reference
        };
        cons.accept("Bonjour");

        //2- dans l'expression labda ci-dessus , on a une seule ligne, donc  on peut la simplfier
        Consumer<String> cons2 = s -> System.out.println(s);
        cons2.accept("Bonjour : cons2");

        //3- En utilisant la methode de référence
        Consumer<String> cons3 = System.out::println;
        cons3.accept("Bonjour : cons3");
    }
}
