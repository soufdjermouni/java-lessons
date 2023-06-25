package com.codinggame.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOccurEveryChar {

    public static void main(String[] args) {

        String str= "Hello World";
        char [] characters = str.toCharArray();
        Map<Character, Integer> mapCharOcur = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            if(mapCharOcur.containsKey(characters[i])){
                mapCharOcur.put(characters[i], mapCharOcur.get(characters[i])+1);
            } else {
                mapCharOcur.put(characters[i], 1);
            }
        }

        mapCharOcur.keySet().stream().forEach(k -> System.out.println("key= "+k + " value="+mapCharOcur.get(k)));

        System.out.println("another way");
        int[] occurences = countChars(str);
        System.out.println(occurences);

    }

    public static int[] countChars(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

}
