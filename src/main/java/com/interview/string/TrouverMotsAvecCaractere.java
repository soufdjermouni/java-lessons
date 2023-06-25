package com.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrouverMotsAvecCaractere {

    public static void main(String[] args) {
        String[] mots = {"Java", "Python", "c++", "Ruby", "Perl","Aylan"};
        String chaine = "aBc";
        List<String> resultats = trouverMotsAvecCaractere(mots, chaine);
        System.out.println(resultats);
        String [] result = resultats.stream().toArray(String[]::new);
   }

    public static List<String> trouverMotsAvecCaractere(String[] mots, String chaine) {
        List<String> resultats = new ArrayList<String>();
        for (String mot : mots) {
            for (int i = 0; i < chaine.length(); i++) {
                if (mot.contains(Character.toString(chaine.charAt(i)))) {
                    resultats.add(mot);
                    break;
                }
            }
        }
        return resultats;
    }
}
