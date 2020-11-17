package com.swathi;

public class Main {

    public static void main(String[] args) {
	    String myString = "Hi there!";
        System.out.println(myString);
        // Hi there!
        myString = myString + " This is String.";
        System.out.println(myString);
        // Hi there! This is String.
        myString = myString ="copyright \u00A9 2020";
        System.out.println(myString);
        // copyright © 2020

        String stringValue = "22";
        int value = 10;
        System.out.println(stringValue+ value);
        //2210


    }
}
