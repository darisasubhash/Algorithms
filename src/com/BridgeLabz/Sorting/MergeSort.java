package com.BridgeLabz.Sorting;

public class MergeSort {
    public static <T extends Comparable<T>> void sort(T []ar){
        if(ar.length<=1){
            return;
        }
        int length=ar.length;
        int middle=length/2;
        T[] left = (T[]) new Comparable[middle];
        T[] right = (T[]) new Comparable[length - middle];
        int i=0;
        int j=0;
        for(;i<ar.length;i++){
            if(i<middle){
                left[i]=ar[i];
            }
            else{
                right[j]=ar[i];
                j++;
            }
        }
        sort(left);
        sort(right);
        merge(left,right,ar);


    }
    public static <T extends Comparable<T>> void merge(T[] left,T []right,T []ar){

        int leftSize=ar.length/2;
        int rightSize=ar.length-leftSize;
        int i=0,l=0,r=0;

        while(l<leftSize && r<rightSize){
            if(left[l].compareTo(right[r])<0){
                ar[i]=left[l];
                i++;
                l++;
            }
            else{
                ar[i]=right[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            ar[i]=left[l];
            i++;
            l++;

        }
        while(r<rightSize){
            ar[i]=right[r];
            i++;
            r++;
        }

    }
}
