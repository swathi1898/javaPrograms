package com.swathi;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci of 0 "+fibonacci(0));
        System.out.println("Fibonacci of 1 "+fibonacci(1));
        System.out.println("Fibonacci of 2 "+fibonacci(2));
        System.out.println("Fibonacci of 3 "+fibonacci(3));
        System.out.println("Fibonacci of 4 "+fibonacci(4));
        System.out.println("Fibonacci of 10 "+fibonacci(10));

    }
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }else if (n>1){
            return fibonacci(n-1)+fibonacci(n-2);
        }
        return 0;
    }
}
