package com.lessons.math;

public class MathPowExample {

    public static void main(String[] args) {

        System.out.println("pow="+Math.pow(3,3));
        System.out.println("sqrt="+Math.sqrt(4));
        System.out.println(Math.pow(625,1/2));
        System.out.println(Math.pow(625,1/2)+Math.sqrt(144));

        System.out.println("625 élevé à la puissance 1/2 = "+powerFunction(625,1/2));
    }

    static int powerFunction(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }
}
