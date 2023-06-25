package com.interview.algorithm.entier;

import java.util.Arrays;

public class DeuxiemePlusGrandIntTab {
    public static void main(String[] args) {
        int[] tab = {5, 10, 8, 2, 15};
        Arrays.sort(tab);
        int deuxiemePlusGrand = tab[tab.length-2];
        System.out.println("Le deuxième plus grand élément est: " + deuxiemePlusGrand);//6

    }
}
