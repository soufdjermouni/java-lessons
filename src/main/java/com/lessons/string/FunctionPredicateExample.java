package com.lessons.string;

import java.util.function.Predicate;

/**
 * En Java 8, l'interface fonctionnelle java.util.function.Predicate<T> peut être utilisée comme une fonction à un
 * argument qui retourne un boolean. Cette interface a une méthode par défaut appelée test(T t) qui prend un
 * argument de type T et renvoie un boolean.
 */
public class FunctionPredicateExample {

    public static void main(String[] args) {

        /* Dans cet exemple, nous avons créé une instance de l'interface Predicate<Integer> en utilisant une expression
        lambda qui vérifie si un entier est pair en utilisant l'opérateur modulo %. Nous avons ensuite appelé la
        méthode test() de cette instance pour vérifier si l'entier 4 est pair (ce qui renvoie true)
        et si l'entier 5 est pair (ce qui renvoie false).
         */
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}
