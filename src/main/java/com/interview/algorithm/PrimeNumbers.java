package com.interview.algorithm;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through all numbers between 1 and 100
        for (i = 2; i <= 100; i++) {
            flag = 1; // Assume the number is prime

            // Check if the number is divisible by any number between 2 and i/2
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = 0; // The number is not prime
                    break; // Exit the loop
                }
            }

            // If the number is prime, print it
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

