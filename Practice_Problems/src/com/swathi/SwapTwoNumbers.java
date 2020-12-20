package com.swathi;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swapNumbers(1,2);
        swapNum(1,2);
    }

    public static void swapNumbers(int a, int b){
        int x;
        int y;
        x=a;
        y= b;
        a=b;
        b=x;
        System.out.println("numbers is swapped into "+a+" & "+b);
    }
    public static void swapNum(int a,int b){
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println(a +" & " +b);
    }
}
