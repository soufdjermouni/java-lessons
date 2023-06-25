package com.katacode;

import java.util.Arrays;

public class Kata4ContainsDuplicate {

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0;  i< nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
