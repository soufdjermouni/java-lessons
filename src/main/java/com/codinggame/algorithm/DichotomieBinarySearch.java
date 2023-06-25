package com.codinggame.algorithm;

import java.util.Arrays;

public class DichotomieBinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,7,3};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,3));

        binarySearchV2(arr,0,arr.length-1,3) ;

        int[] ints = {-9, 14, 37, 102};
        System.out.println(exists(ints, 102)); // true
        System.out.println(exists(ints, 36)); // false
    }

    public static void binarySearchV2(int tab[], int f, int l, int val){
        int mid = (f + l)/2;
        while(f <= l){
            if (tab[mid] < val){
                f = mid + 1;
            }else if(tab[mid] == val){
                System.out.println("L'élément se trouve à l'index: " + mid);
                break;
            }else{
                l = mid - 1;
            }
            mid = (f + l)/2;
        }
        if (f > l){
            System.out.println("L'élément n'existe pas!");
        }
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == target ) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else{
                right= mid -1;
            }
        }
        return -1;
    }

    static boolean exists(int[] ints, int k) {
        boolean result = false;
        int left =0;
        int right = ints.length;
        while(left<=right) {
            int medium = (left+right)/2;
            if (ints[medium] == k) {
                result = true;
                return result;
            } else if(ints[medium]  <k){
                left = medium +1;
            } else {
                right = medium -1;
            }
        }

        return result;
    }
}
