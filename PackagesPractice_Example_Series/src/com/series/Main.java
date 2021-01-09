package com.series;

import com.swathi.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------Sum of first 10 natural numbers----------------------------------------------------------");
        for(int i=0;i<=10;i++){
        System.out.println(Series.nSum(i));
    }
        System.out.println("----------------First 10 Fibonacci series----------------------------------------------------------");
        for(int i=0;i<=10;i++){
        System.out.println(Series.fibanacci(i));
    }
        System.out.println("----------------First 10 Factorials----------------------------------------------------------");
        for(int i=0;i<=10;i++){
        System.out.println(Series.factorial(i));
    }
    }
}
