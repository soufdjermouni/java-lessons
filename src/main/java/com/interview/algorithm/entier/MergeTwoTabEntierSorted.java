package com.interview.algorithm.entier;

import java.util.Arrays;

public class MergeTwoTabEntierSorted {

    public static void main(String[] args) {
        int[]  tab1 = new int[]{1, 3, 5, 7};
        int[]  tab2 = new int[]{2, 4, 6, 8};

        int [] merge = new int [tab1.length+tab2.length];
        for (int i = 0; i < tab1.length; i++) {
            merge[i]=tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            merge[tab1.length + i]=tab2[i];
        }

        Arrays.sort(merge);
        System.out.println(merge);
    }
}
