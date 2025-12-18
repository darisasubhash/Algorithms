package com.bridgelabz.searching;

public class LinearSearch {
    public static <T> int search(T [] ar,T value){
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}
