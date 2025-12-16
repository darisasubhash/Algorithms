package com.BridgeLabz.Searching;

public class BinarySearch {
    public static <T extends Comparable<T>> int search(T []ar,T value){
        int left=0;
        int right=ar.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ar[mid].compareTo(value)==0){
                return mid;
            }
            else if(value.compareTo(ar[mid])<0){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return -1;
    }
}
