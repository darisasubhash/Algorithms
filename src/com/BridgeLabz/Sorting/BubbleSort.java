package com.BridgeLabz.Sorting;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T ar[]){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j].compareTo(ar[j+1])>0){
                    T temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }

    }
}


