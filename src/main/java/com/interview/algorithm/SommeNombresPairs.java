package com.interview.algorithm;

public class SommeNombresPairs {

    public static void main(String[] args) {
        int[] tab = {3, 8, 2, 5, 10};
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                somme = somme + tab[i];
            }
        }
        System.out.println("La somme des nombres pairs est: " + somme);
    }
}
