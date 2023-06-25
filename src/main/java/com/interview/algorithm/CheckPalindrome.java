package com.interview.algorithm;

public class CheckPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Laval"));
        System.out.println(isPalindrome2("Laval"));
    }

    public static boolean isPalindrome2(String str) {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isPalindrome(String str) {

        boolean result = false;
        for (int i = 0; i < str.length() ; i++) {

            for (int j = str.length() -1; j >=0 ; j--) {
                if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) {
                    result = true;
                } else {
                    result = false;
                }
                i++;
            }
        }

        return result;
    }
}
