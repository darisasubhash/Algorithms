package com.bridgelabz.sorting;

public class QuickSort {
    public  static <T extends Comparable<T>> void sort(T[] ar,int start,int end){
        if(end<=start){
            return;
        }
        int pivot=partition(ar,start,end);
        sort(ar,start,pivot-1);
        sort(ar,pivot+1,end);

    }

    private static <T extends Comparable<T>> int partition(T[] ar, int start, int end) {
        T pivot=ar[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(ar[j].compareTo(pivot)<0){
                i++;
                T temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
        }
        i++;
        T temp=ar[i];
        ar[i]=ar[end];
        ar[end]=temp;

        return i;
    }
}
