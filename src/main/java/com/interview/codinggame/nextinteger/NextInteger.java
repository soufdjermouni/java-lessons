package com.interview.codinggame.nextinteger;

public class NextInteger {
    public static int next(int n) {
        if (  n<=0 || n >= Math.pow(2,31)) { //2147483647
            // If n is 2147483647 or greater, there is no such integer.
            return 1;
        }
        boolean[] usedDigits = new boolean[10]; // to keep track of used digits (0-9)

        // Extract the digits of n and mark them as used
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            usedDigits[digit] = true;
            temp /= 10;
        }

        // Find the next integer with distinct digits
        for (int i = n + 1; i <= 987654321; i++) {
            temp = i;
            boolean isValid = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (usedDigits[digit]) {
                    isValid = false;
                    break;
                }
                temp /= 10;
            }
            if (isValid) {
                return i;
            }
        }

        // If no such integer is found, return 1
        return 1;
    }

    public static void main(String[] args) {
        int n = 654321;
        int result = next(n);
        System.out.println("Next integer with distinct digits: " + result);
    }
}

