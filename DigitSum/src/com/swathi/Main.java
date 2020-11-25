package com.swathi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(1));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number<10){
            return -1;
        }
         while(number>0){
             int n= number%10;
             number = number/10;
             sum += n;
         }

         return sum;

    }
}
