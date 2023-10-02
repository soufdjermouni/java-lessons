package com.lessons.interfacefonctionnelle.BiFunction;

import com.lessons.integer.atomicinteger.IntegerExample;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @FunctionalInterface
 * public interface BiFunction<T, U, R> {
 *
 * R apply(T t,U u);
 *
 */
public class BiFunctionExample {

    public static void main(String[] args) {

        //Implémenter et utiliser une BiFunction pour chercher la position d'une chaîne dans une autre
        BiFunction<String, String, Integer> indexOf =
                (s1,s2) -> s1.indexOf(s2);

        BiFunction<String, String, Integer> indexOf2 =
                String::indexOf;
        int index = indexOf.apply("Bonjour", "on");
        System.out.println(index);//1

        //Transformer une BiFunction en Function par application partielle
        Function<String, Integer> indexOfInBonjour =
                s -> indexOf.apply("Bonjour",s);
        System.out.println(indexOfInBonjour.apply("r"));//6

    }
}
