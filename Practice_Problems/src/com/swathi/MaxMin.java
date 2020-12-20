package com.swathi;

import java.util.Arrays;

public class MaxMin {


    public static void main(String[] args) {
        int[] arr = {1,55,10,7,40,3,44,5,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("minimum = "+ arr[0]);
        System.out.println("Maximum = "+ arr[arr.length-1]);

    }

}
