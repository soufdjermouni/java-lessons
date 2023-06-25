package com.codinggame.algorithm;

/**
 * You are given a sequence of characters consisting of parentheses () and brackets []. A string of this type
 * is said to be correct: if it is an empty or null string if the string A is correct, (A) and [A] are correct if the
 * string A and B are correct, the concatenation AB is also correct Input: The string contains at most 10 000
 * characters.
 * Examples: [()] is correct, (()[]) is correct, ([)] is not correct, (( is not correct.
 * Implement the method check(String str) to check the correctness of a string of this type. check returns
 * true if the string is correct, false otherwise.
 */
public class StringParser {

    public static void main(String[] args) {
        String str = "[()()]";
        System.out.println(check(str));
    }

    private static boolean check(String str) {
        if (str == null || str.length() == 0) {
            return true;
        } else {
            String cache = str;
            String iterator = "";
            while (true) {
                iterator = cache.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "");
                if (iterator.equals(cache)) {
                    break;
                }
                cache = iterator;
            }
            return cache.isEmpty();
        }
    }
}
