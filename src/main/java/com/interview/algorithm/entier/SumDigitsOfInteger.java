package com.interview.algorithm.entier;

public class SumDigitsOfInteger {

    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        while (num!=0) {
            sum +=num%10;
            num/=10;
        }

        System.out.println(sum);
    }
}
