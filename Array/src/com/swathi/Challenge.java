package com.swathi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Challenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printIntegers(myIntegers);
        sortIntegers(myIntegers);

    }
    public static void printIntegers(int[] number){
        for(int i =0;i<number.length;i++){
            System.out.println("Element "+i+" Value is "+number[i]);
        }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" numbers : \r");
        int[] values = new int[number];
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void sortIntegers(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("descending order of element "+i+" is "+arr[i]);

        }
    }

}
