package com.interview.codinggame.algorithm;

import java.util.*;

public class FindSumPair {

    public static void main(String[] args) {
        int [] numbers = {1,5, 8,1,5,2,8};
        int k = 13;
        int [] pair = findSumPair(numbers, k);
        System.out.println(Arrays.toString(pair));
    }

    private static int[] findSumPair(int[] numbers, int k) {
        int [] result = {0,0};

        Map<Integer, int[]>  map = new HashMap<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j] == k) {
                    //result = new int []{i,j};
                    if(!map.containsKey(i)) {
                        map.put(i, new int[]{i, j});
                    }
                }

            }
        }

        int indiceFisrt = 0;
        int indiceLast = 0;
        Set<Integer> listeIndiceFirst = new HashSet(map.keySet());
        for (Map.Entry<Integer, int[]>  entry: map.entrySet()  ) {
            if(map.size() ==1) return  entry.getValue();

            if (listeIndiceFirst.size() == 1) {
                if(indiceLast ==0 || entry.getValue()[1] < indiceLast) {
                    indiceFisrt = entry.getKey();
                    indiceLast =entry.getKey();
                }
            } else {
                if(indiceFisrt ==0 || entry.getKey() < indiceFisrt) {
                    indiceFisrt =entry.getKey();
                    indiceLast = entry.getValue()[1];
                }
            }

        }
        result = new int[]{indiceFisrt,indiceLast};
        return result;
    }

}
