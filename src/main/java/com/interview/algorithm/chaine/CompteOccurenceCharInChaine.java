package com.interview.algorithm.chaine;

import java.util.HashMap;
import java.util.Map;

/**
 * Voici quelques exercices Java de la plateforme "Codingame Entreprise" avec des solutions:
 *
 * Exercice 1: Écrire une méthode Java qui prend en entrée une chaîne de caractères et retourne le
 * nombre d'occurrences de chaque caractère dans la chaîne.
 */
public class CompteOccurenceCharInChaine {

    public static void main(String[] args) {

        String chaine = "abeecdadesee";
        Map<Character, Integer> occurrences = new HashMap<>();
        for (int i = 0; i <chaine.length() ; i++) {
            if(occurrences.containsKey(chaine.charAt(i))) {
                Character mychar= Character.valueOf(chaine.charAt(i));
                occurrences.put(chaine.charAt(i),occurrences.get(mychar) + 1);
            } else {
                occurrences.put(chaine.charAt(i), 1);
            }

        }

        occurrences.keySet().stream().forEach(k -> System.out.println("key= "+k + " value="+ occurrences.get(k)));

    }
}
