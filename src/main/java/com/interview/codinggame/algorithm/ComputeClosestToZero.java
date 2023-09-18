package com.interview.codinggame.algorithm;

import java.io.PrintStream;
import java.util.Scanner;

public class ComputeClosestToZero {

    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        if(null == ts || ts.length ==0) {
            return 0;
        }

        int result = ts[0];
        for (int i = 1; i < ts.length; i++) {
            if (Math.abs(result) > Math.abs(ts[i])
                    || (Math.abs(ts[i]) == Math.abs(result) && ts[i] >
                    result)) {
                result = Math.abs(ts[i]);
            }
        }
        // To debug:
        System.err.println("Debug messages..." + result);
        return result;
    }
}
