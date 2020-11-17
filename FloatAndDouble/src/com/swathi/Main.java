package com.swathi;

public class Main {

    public static void main(String[] args) {
        int intValue = 5/3;
        float floatValue =5f /3f;
        double doubleValue = 5d /3f;
        System.out.println("intValue = "+intValue);
        System.out.println("floatValue =" + floatValue);
        System.out.println("doubleValue ="+doubleValue);

//        step1: create a varialble to store the value of pounds
//        step2: converting pounds to kilogram
//        step3: printing the result
        int pounds = 20;
        double kilogram = pounds * 0.45359237d;
        System.out.println(pounds +" pound is equal to "+ kilogram+ " kilograms.");

    }
}
