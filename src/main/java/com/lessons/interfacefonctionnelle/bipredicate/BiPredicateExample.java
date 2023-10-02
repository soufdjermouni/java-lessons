package com.lessons.interfacefonctionnelle.bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<String, String> bp1 =
                (s1,s2) -> s1.contains(s2);
        boolean b1 = bp1.test("Bonjour", "on");
        System.out.println(String.valueOf(b1));//true

        BiPredicate<String, String> bp2 =
                String::contains;
        boolean b2 = bp2.test("Bonjour", "on");
        System.out.println(String.valueOf(b2));//true


        //Transformer un BiPredicate en Predicate par application partielle
        //Example : crer un prodicate qui teste si une chaine cintient ke mot "ERROR"
        Predicate<String> p =
                s -> bp1.test(s, "ERROR");


    }
}
