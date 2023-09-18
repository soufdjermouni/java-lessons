package com.interview.codinggame.algorithm;

public class Pyramid {

    public static void main(String[] args) {

        System.out.println(get(4, 2)); //should return the string 6
        System.out.println(get(5, 0)); //should return the string 1
        System.out.println(get(67, 34)); // should return the string 14226520737620288370
    }

    static String get(int l, int c) {
        int size = Math.max(l, c) + 1;
        int[][] table = new int[size][size];

        for (int i = 1; i < size + 1; i++) {
            table[i - 1][0] = 1;

            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = table[i - 1][j] + table[i - 1][j - 1];
                }
                if (i == l && j == c) {
                    return String.valueOf(table[l][c]);
                }
                //System.out.println(i + ";" + j + ";" + table[i][j]);
            }
        }
        return String.valueOf(table[l][c]);

    }
}
