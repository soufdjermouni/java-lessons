package com.interview.codinggame.algorithm;

import java.util.Arrays;

public class DichotomieBinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,7,3};
        Arrays.sort(arr);
        System.out.println("binarySearch = " +binarySearch(arr,3));

        System.out.println("binarySearchV2 = "+binarySearchV2(arr,3)) ;


        int[] ints = {-9, 14, 37, 102};
        System.out.println("exists= "+exists(ints, 102)); // true
        System.out.println(exists(ints, 36)); // false
        System.out.println(exists(ints, -9)); // true
        System.out.println("existsApiJ2SE= "+existsApiJ2SE(ints, 102)); // true
        int[] emptyArray = {};
        System.out.println(exists(emptyArray, 36)); // false
        System.out.println(binarySearchV2(ints, 102)); // true

    }

    static boolean existsApiJ2SE(int[] ints, int k) {

        int result = Arrays.binarySearch(ints,k);
        if(result<0) {
            return false;
        } else {
            return true;
        }

    }

    static boolean existsApiJ2SEDetails (int[] ints, int k) {

        //premeir element
        int f=0;
        //dernier element
        int l = ints.length-1;
        int mid = (f + l)/2;
        while(f <= l){
            if (ints[mid] < k){
                f = mid + 1;
            }else if(ints[mid] == k){
                return true;
            }else{
                l = mid - 1;
            }
            mid = (f + l)/2;
        }
        if (f > l){
            return false;
        }
        return false;
    }



    public static boolean binarySearchV2(int [] tab , int val){

        //premeir element
        int f=0;
        //dernier element
        int l = tab.length-1;
        int mid = (f + l)/2;
        while(f <= l){
            if (tab[mid] < val){
                f = mid + 1;
            }else if(tab[mid] == val){
                return true;
            }else{
                l = mid - 1;
            }
            mid = (f + l)/2;
        }
        if (f > l){
            return false;
        }
        return false;
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
        int right = ints.length -1;
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
