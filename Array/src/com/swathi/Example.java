package com.swathi;

public class Example {
    public static void main(String[] args) {
        int[] myInt = new int[10];
        myInt[5]=50;
        System.out.println(myInt[5]);
        System.out.println("--------------------------");
        int[] myIntarray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntarray[5]);
        System.out.println(myIntarray[9]);
        System.out.println(myIntarray[0]);
        System.out.println("--------------------------");
        int[] intValue = new int[10];
        for(int i =0;i<intValue.length;i++){
            intValue[i]= i*100;
        }
        printArray(intValue);

    }
    public static void printArray(int[] array){
        for(int i =0;i<array.length;i++){
            System.out.println("Element "+i+" Value is "+array[i]);
        }
    }
}
