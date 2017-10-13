package com.gamedirty.java.sorts;

/**
 * 两个标记比较
 */
public class BinarySearch {
    public int indexOf(int[] arr,int target){
        int start = 0,end = arr.length-1;
        int index = -1;
        while (start<end){
            int mid = (start+end)/2;
            if (arr[mid]<=target){
                if (arr[mid]==target){
                   return mid;
                }else {
                    start = mid;
                }
            }else {
                end = mid;
            }
        }
        return -1;
    }
}
