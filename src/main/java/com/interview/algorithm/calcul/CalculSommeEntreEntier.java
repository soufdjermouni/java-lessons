package com.interview.algorithm.calcul;

public class CalculSommeEntreEntier {
    public static void main(String[] args) {

        int [] array = new int []{ 0,1,2,3,4,5,3};
        System.out.println(CalculSommeEntreEntier.calc(array, 0,1));//1
        System.out.println(CalculSommeEntreEntier.calc(array, 0,5));//15
        System.out.println(CalculSommeEntreEntier.calc(array, 0,0));//0
        System.out.println(CalculSommeEntreEntier.calc(array, 0,6));//18
    }

    private static int calc(int[] array, int n1, int n2) {
        int sum = 0;

        if(n1 >=0 && n1 <=n2 && n1 <array.length)
        {
            for (int i = n1; i <= n2; i++) {
                sum+=array[i];
            }

        }else {
            throw new ArithmeticException("illegal arguement !");
        }
        return sum;
    }
}
