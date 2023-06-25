package com.interview.algorithm.entier;

public class indicePlusProche {

    public static void main(String[] args) {
        System.out.println(indicePlusProche( new int []{5,6,8,9,10}, 10));
    }
    public static int indicePlusProche(int[] tab, int valeur) {
        int debut = 0;
        int fin = tab.length - 1;
        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            if (tab[milieu] == valeur) {
                return milieu;
            } else if (tab[milieu] > valeur) {
                fin = milieu - 1;
            } else {
                debut = milieu + 1;
            }
        }
        if (fin < 0) {
            return debut;
        } else if (debut >= tab.length) {
            return fin;
        } else if (valeur - tab[fin] < tab[debut] - valeur) {
            return fin;
        } else {
            return debut;
        }
    }

}
