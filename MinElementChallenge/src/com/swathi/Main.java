package com.swathi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
	int[] myInt = readIntegers(count);
	for(int i=0;i<myInt.length;i++){
        System.out.println("Element "+i+" value was "+myInt[i]);
    }

        System.out.println("minimum value is "+findMin(myInt));
    }
    public static int[] readIntegers(int number){

        int[] value = new int[number];
        for(int i=0;i<value.length;i++){
            System.out.println("enter "+number+" numbers: ");
            value[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return value;
    }
    public static int findMin(int[] array){

        int minimum = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<minimum){
                minimum = array[i];
            }
        }
        return minimum;

    }
}
