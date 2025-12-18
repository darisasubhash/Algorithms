package com.bridgelabz.sorting;

public class SelectionSort {
    public static <T extends Comparable<T>> void sort(T ar[]){
        for(int i=0;i<ar.length-1;i++){
            int index=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[index].compareTo(ar[j])>0){
                    index=j;
                }
            }
            T temp=ar[i];
            ar[i]=ar[index];
            ar[index]=temp;
        }
    }
}
