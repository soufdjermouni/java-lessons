package com.interview.algorithm.chaine;

import java.util.HashMap;
import java.util.Map;

public class SousChaineDistincte {

    public static void main(String[] args) {
        System.out.println(sousChaineDistincte("abcdefhhhherererxcvb"));
    }

    public static String sousChaineDistincte(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int n = str.length();
        int maxLen = 1;
        int start = 0;
        int end = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 0);

        for (int i = 1; i < n; i++) {
            char c = str.charAt(i);

            if (map.containsKey(c)) {
                int index = map.get(c);
                if (index >= start) {
                    start = index + 1;
                }
            }

            map.put(c, i);
            end = i;
            int len = end - start + 1;
            if (len > maxLen) {
                maxLen = len;
            }
        }

        return str.substring(start, start + maxLen);
    }
}