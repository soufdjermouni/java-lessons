package com.interview.codinggame.algorithm;

import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;

/**
 * Voici un exemple d'algorithme en Java pour trouver le k-ème nombre manquant positif dans un tableau :
 *
 * Given an array arr of positive integers sorted in a strictly increasing order, and a intger K.
 *
 * Retrun
 */
public class KthMissingElementInSortedArray {

    /**
     * Bruteforce Searching
     *
     * @param arr
     * @param k
     * @return
     */
    public static int findKthMissingPositiveNumber(int[] arr, int k) {

        for(int i = 0;i < arr.length;i++){
            if(arr[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }

    /**
     * Binary Search : Dicotomie
     *
     * @param arr
     * @param k
     * @return
     */
    public static int findKthMissingPositiveNumberBinarySearch(int[] arr, int k) {
        int start =0;
        int end = arr.length-1;
        int missing = arr[end] - (end + 1);
        while(start <= end){
            int mid = start + (end - start) / 2;
            missing = arr[mid] - (mid + 1);
            if(missing >= k){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start + k;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int k = 2;
        System.out.println("pour le tableau : " + arr);
        System.out.println(findKthMissingPositiveNumber(arr, k)); //6
        System.out.println(findKthMissingPositiveNumberBinarySearch(arr, k)); //6
        // Explication : As in the given array, the first missing number is 5 and the second missing number is 6.  So,
        // the answer is 6.: [5,6,7,...], le K ieme ici = 6

        int [] arr2 = {2,3,4,7,11};
        int k2 = 5;
        System.out.println("pour le tableau : " + arr2);
        System.out.println(findKthMissingPositiveNumber(arr2, k2)); //9
        System.out.println(findKthMissingPositiveNumberBinarySearch(arr2, k2)); //9
        // Explication : the missing possitve interger : [1,5,6,8,9,10,12,,...], le K ieme ici = 9


        int [] arr3 = {1, 3 ,  6, 7};
        int k3 = 4;
        System.out.println("pour le tableau : " + arr3);
        System.out.println(findKthMissingPositiveNumber(arr3, k3)); //8
        System.out.println(findKthMissingPositiveNumberBinarySearch(arr3, k3)); //8
        // Explication : the missing possitve interger : [2 4 5 8 9,,...], le K ieme ici = 8
    }

    static int compute(int actual, int expected){
        return actual - expected;
    }
}
