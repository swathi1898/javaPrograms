package com.swathi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    //--------------------------Reverse a string---------------------------------------------------------------------
//        System.out.println("enter string ");
//        ReverseString string = new ReverseString(scanner.nextLine());
//        string.reverse(string);
    // --------------------------------------autoboxing example------------------------------------------------------
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for(int i =0;i<=10;i++){
            intArray.add(Integer.valueOf(i));

        }
        for(int i =0;i<=10;i++){
            System.out.println(i+" - "+(intArray.get(i)+10));
        }
    }
}
