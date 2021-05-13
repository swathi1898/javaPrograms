package com.swathi;

public class Fibonacci {
    public static void main(String[] args) {
        for(int i = 0;i<11;i++){
            System.out.println("Fibonacci of "+i+": "+fibonacci(i));

        }
        int a = 0, b= 1,count=10;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2; i<count ; ++i){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
//        System.out.println("Fibonacci of 1 "+fibonacci(1));
//        System.out.println("Fibonacci of 2 "+fibonacci(2));
//        System.out.println("Fibonacci of 3 "+fibonacci(3));
//        System.out.println("Fibonacci of 4 "+fibonacci(4));
//        System.out.println("Fibonacci of 10 "+fibonacci(10));

    }
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }else if (n>1){
            return fibonacci(n-1)+fibonacci(n-2);
        }
        return 0;
    }
    public static void fib(int n){
        int a = 0, b= 1;
        System.out.println(a +" "+b);
        for(int i = 2; i<n ; ++i){
           int c = a+b;
            System.out.println(" "+c);
            a = b;
            b = c;
        }
    }
}
