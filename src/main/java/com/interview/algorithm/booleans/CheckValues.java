package com.interview.algorithm.booleans;

public class CheckValues {

    public static void main(String[] args) {
        System.out.println(CheckValues.a(1,5));//tre
        System.out.println(CheckValues.a(2,3));//false
        System.out.println(CheckValues.a(-3,4));//true
    }

    private static boolean a(int a, int b) {

        boolean result = false;
        if(a ==1 || b==1 || (a+b) == 1){
             result = true;
        }
        return result;


    }
}
