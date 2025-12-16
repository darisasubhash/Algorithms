package com.BridgeLabz.Sorting;

public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T ar[]){
        for(int i=0;i<ar.length;i++){
            T temp=ar[i];
            int j=i-1;
            while(j>=0 && ar[j].compareTo(temp)>0){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
        }

    }
}
