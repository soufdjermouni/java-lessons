package com.interview.codinggame.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequenciesWordInTabWord {

    public static void main(String[] args) {
        String[] words = {"the", "dog", "got", "the", "bone"};
        int [] frequencies = countFrequencies(words);
        System.out.println(Arrays.toString(frequencies));
    }

   public static int [] countFrequencies(String [] words){

       Arrays.sort(words);
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

       String[] sortedMots = map.keySet().toArray(new String[map.size()]);
       Arrays.sort(sortedMots);

        int[] frequencies = new int[map.size()];

        int i = 0;
        for (String frequency : sortedMots) {
            frequencies[i++] = map.get(frequency);
        }

        return frequencies;
    }
}
