package com.lessons.interfacefonctionnelle.BinaryOperator;

import java.util.function.BinaryOperator;

/**
 * @FunctionalInterface
 * public interface BinaryOperator<T> extends BiFunction<T,T,T> {
 *
 *    public static<T> BinaryOperator<T> minBy(Comparator<? super T>comparator){
        *Objects.requireNonNull(comparator);
        *return(a,b)->comparator.compare(a,b)<=0?a:b;
        *}
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {

        //binaryOperateur qui fait la concaténation
        BinaryOperator<String> concat =
                (s1,s2) -> s1+s2;
        String s = concat.apply("Bonjour ", "le monde");
        System.out.println(s);//Bonjour le monde

        BinaryOperator<String> add =
                (i1,i2) -> i1+i2;
    }
}
