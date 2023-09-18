package com.interview.opration;

public class SumRange {
    public static void main(String[] args) {
        int [] ints  = {1,20,3,10,-2,100};
        int result = sumRange(ints);
        System.out.println("result: "+ result); //
        System.out.println("expected result: 130");
    }

    private static int sumRange(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            if( n >=10 && n<=100) sum+=n;
        }
        return sum;
    }
}
