package com.swathi;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 0 "+ factorial(0));
        System.out.println("Factorial of 1 "+ factorial(1));
        System.out.println("Factorial of 2 "+ factorial(2));
        System.out.println("Factorial of 3 "+ factorial(3));
        System.out.println("Factorial of 4 "+ factorial(4));
        System.out.println("Factorial of 5 "+ factorial(5));
        System.out.println("Factorial of 6 "+ factorial(6));
    }
    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n-1);
        } else if (n == 0) {
            return 1;
        }
        return -1;
    }
}
