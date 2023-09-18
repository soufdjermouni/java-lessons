package com.interview.codinggame;

import java.util.Map;
import java.util.TreeMap;

public class FizzBuzzFix {
    public static void main(String[] args) {
        // Exemple d'utilisation de la méthode
        Map<Integer, String> map = new TreeMap<>(); // Utilisation de TreeMap pour trier les diviseurs
        map.put(3, "Fizz");
        map.put(4, "Buzz");

        System.out.println(fizzBuzz(5, map));//5
        System.out.println(fizzBuzz(3, map));//FIZZ
        System.out.println(fizzBuzz(4, map));//BUZZ
        System.out.println(fizzBuzz(12, map));//FIZZBUZZ
    }

    public static String fizzBuzz(int number, Map<Integer, String> map) {
        StringBuilder result = new StringBuilder();

        // Triez les clés (diviseurs) en ordre croissant
        Map<Integer, String> sortedMap = new TreeMap<>(map);

        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            int divisor = entry.getKey();
            String value = entry.getValue();

            if (number % divisor == 0) {
                result.append(value);
            }
        }

        // Si aucune clé n'a pu diviser number, utilisez la représentation en chaîne de caractères de number
        if (result.length() == 0) {
            result.append(Integer.toString(number));
        }

        return result.toString();
    }
}
