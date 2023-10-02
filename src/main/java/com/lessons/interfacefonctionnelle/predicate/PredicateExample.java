package com.lessons.interfacefonctionnelle.predicate;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * C'est quoi un predicate  :
 *
 * @FunctionalInterface
 * public interface Predicate<T> {
 *
 * boolean test(T t);
 *
 */
public class PredicateExample {

    public static void main(String[] args) {

        //Ex 1 : un predicate de chaine du caratère qui retourne vrai si la chaine s (entre paramètre) est non nulle
        Predicate<String> p1 = s -> {
            return s != null;
        };
        boolean b1 = p1.test("bonjour");
        System.out.println(String.valueOf(b1));//true

        Predicate<String> p2 = s -> s != null;
        Predicate<String> p3 = Objects::nonNull;

        //Ex2 : vrai si s fait moins de 10 caractètres
        Predicate<String> pp1 = s -> s.length() < 10;
        System.out.println(String.valueOf(pp1.test("Bonjour")));//true
        System.out.println(String.valueOf(pp1.test("Bonjour Le monde")));//false
    }
}
