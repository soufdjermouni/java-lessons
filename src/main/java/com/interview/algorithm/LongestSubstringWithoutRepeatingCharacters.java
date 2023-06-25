package com.interview.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        int maxLength = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return maxLength;
    }
}
