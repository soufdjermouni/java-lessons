package com.interview.codinggame.algorithm;

import java.io.PrintStream;
import java.util.Scanner;

public class BrasRobotique {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // game loop
        while (true) {
            int weight0 = in.nextInt();
            int weight1 = in.nextInt();
            int weight2 = in.nextInt();
            PrintStream outStream = System.out;
            System.setOut(System.err);
            int action = solve(weight0, weight1, weight2);
            System.setOut(outStream);
            System.out.println(action);
        }
    }

    public static int solve(int weight0, int weight1, int weight2) {
        if( (weight0 >=weight1) && (weight0 > weight2) ){
            return 0;
        } else if (( (weight1 >=weight0) && (weight1> weight2) )){
            return 1;
        } else {
            return 2;
        }
    }
}
