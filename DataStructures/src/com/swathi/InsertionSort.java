package com.swathi;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                System.out.println("while array:"+ Arrays.toString(array));
                i--;
            }
            array[i+1] = key;
            System.out.println("After while array:"+ Arrays.toString(array));
        }
    }

    public static void main(String a[]){
        int[] arr1 = {5,1,4,3,2};
        System.out.println("Before Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
