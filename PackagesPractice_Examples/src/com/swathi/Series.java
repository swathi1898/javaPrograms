package com.swathi;

public class Series {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
        System.out.println(fibanacci(3));
    }
    public static int nSum(int n){
        if(n>=1){
            return n+nSum(n-1);
        }
        return 0;
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else if(n>=1){
            return n* factorial(n-1);
        }
        return -1;

    }
    public static int fibanacci(int n){
        if(n==1){
            return 1;
        }else if(n>1){
            return fibanacci(n-1)+fibanacci(n-2);
        }
        return 0;
    }
}
