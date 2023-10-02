package com.lessons.interfacefonctionnelle.UnaryOperator;

import java.util.function.UnaryOperator;

/**
 *
 * @FunctionalInterface
 * public interface UnaryOperator<T> extends Function<T, T> {
 *
 *      static<T> UnaryOperator<T> identity(){
 *          return t->t;
 *    }
 *
 */
public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<String> uppercase =
                s -> s.toUpperCase();

        UnaryOperator<Integer> increment =
                i -> i + 1; //equivalent de ++

        String s = uppercase.apply("Bonjour");
        System.out.println(s);//BONJOUR

        int inc = increment.apply(10);
        System.out.println(inc);//11
    }
}
