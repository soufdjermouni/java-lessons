package com.interview.booleen;

public class ValeurExpressionTernaire {

    public static void main(String[] args) {

        boolean b = true; // ou false
        boolean c = b ? !b : b;
        System.out.println(c);//false

    }
}
