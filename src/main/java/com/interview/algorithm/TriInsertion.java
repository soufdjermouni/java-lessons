package com.interview.algorithm;

import java.util.Arrays;

public class TriInsertion {

    public static void main(String[] args) {
        int[] tab = {3, 7, 1, 5, 2};
        triInsertion(tab);
        System.out.println("Le tableau trié est: " + Arrays.toString(tab));
    }

    public static void triInsertion(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int valeur = tab[i];
            int j = i - 1;
            while (j >= 0 && tab[j] > valeur) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = valeur;
        }
    }
}
