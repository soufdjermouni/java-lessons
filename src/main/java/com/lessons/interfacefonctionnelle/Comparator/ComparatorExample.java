package com.lessons.interfacefonctionnelle.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @FunctionalInterface
 * public interface Comparator<T> {
 *     /**
 *      *
 *       int compare(T o1,T o2);
 *
 *       int <0  : o1<o2
 *           =0  : o1=o2
 *           >1  : o1>o2
 */
public class ComparatorExample {
    public static void main(String[] args) {

        //Comparator est présent dans la première version de JDK, implémente une seule methode abstraire
        // Sauf avec l'arrivée des interface fonctionnele, il devient mecaniquement une interface fonctionnelle
        Comparator<String> c1  =
                (String s1, String s2) -> s1.compareTo(s2);
        //Le comparator qui permet de comparer les chaine de caractère au sens de l'ordre alphabétique classique
        Comparator<String> c2  =
                String::compareTo;
        System.out.println(c1.compare("B", "A"));//1  (Character A comes before B alphabetically. Hence output is -1
        System.out.println(c1.compare("A", "B"));//-1
        System.out.println(c1.compare("A", "A"));//0

        //trier les chaines de caractère de la plus courte à la plus longue
        Comparator<String> c3  =
                (s1,s2) -> {
                    return Integer.compare(s1.length(),s2.length());
                };
        Comparator<String> c4  =
                Comparator.comparingInt(String::length);

        System.out.println(c3.compare("SOUf", "SOU"));//1
        System.out.println(c3.compare("SOUf", "SO"));//1
        System.out.println(c3.compare("AS", "ASSE"));//-1
        System.out.println(c4.compare("AS", "ASSE"));//-1
        //Arrays.stream(tabStr).collect(
    }
}
