package com.interview.codinggame.algorithm;

import java.util.*;

public class FilterDuplicatesInArray {

    public static void main(String[] args) {
        int [] data = {7,6,4,3,3,4,9};
        int [] resut = filterDuplicates(data);
        System.out.println(Arrays.toString(resut));//[7, 6, 4, 3, 9]
    }

    public static int[] filterDuplicates(int[] data) {
        List<Integer> uniqueData = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (!uniqueData.contains(data[i])) {
                uniqueData.add(data[i]);
            }
        }

        int [] result = uniqueData.stream().mapToInt(i -> i).toArray();
        return result;
    }

}
