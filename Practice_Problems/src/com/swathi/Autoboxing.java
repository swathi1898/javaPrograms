package com.swathi;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for(int i =0;i<=10;i++){
            intArray.add(Integer.valueOf(i));

        }
        for(int i =0;i<=10;i++){
            System.out.println(i+" - "+(intArray.get(i)+10));
        }
    }

}
