package com.interview.algorithm.entier.elementmajoritaire;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ALgoMajorityElement {

    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(getMajorityElement(nums));//3
        System.out.println(majorityElement(nums));//3
        System.out.println(getMajorityElementWithStream(nums));//3

        int [] nums2 = {2,2,1,1,1,2,2};
        System.out.println(getMajorityElement(nums2));//2
        System.out.println(majorityElement(nums2));//2
        System.out.println(getMajorityElementWithStream(nums2));//2

        int [] nums3 = {2,2,1,1,1};
        System.out.println(getMajorityElement(nums3));//1
        System.out.println(majorityElement(nums3));//1
        System.out.println(getMajorityElementWithStream(nums3));//1
    }



    private static int getMajorityElement(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {

            int cnt = 1;
            for (int j = i+1; j < n; j++) {
                if(nums[j] == nums[i])
                    cnt++;
            }
            System.out.println("n/2="+n/2);
            if(cnt > n/2){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }

    public static int majorityElement(int[] nums) {

        // Créez une HashMap pour stocker le comptage des éléments
        Map<Integer, Integer> elementCounts = new HashMap<>();

        // Parcourez le tableau et comptez le nombre d'occurrences de chaque élément
        for (int num : nums) {
            elementCounts.put(num, elementCounts.getOrDefault(num, 0) + 1);
        }

        // Trouvez l'élément avec le plus grand nombre d'occurrences
        int majority = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majority = entry.getKey();
            }
        }

        return majority;
    }

    private static int getMajorityElementWithStream(int[] nums) {


        Map<Integer, Long> countMap = Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i, Collectors.counting()
                ));
        Map.Entry<Integer, Long> majorityEntry = countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > nums.length / 2)
                .findFirst()
                .orElse(null);

        if (majorityEntry != null)
            return majorityEntry.getKey();

            return -1;
    }
}
