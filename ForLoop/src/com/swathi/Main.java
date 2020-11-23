package com.swathi;

public class Main {

    public static void main(String[] args) {

        for (int i=2;i<9;i++){
            System.out.println("interest for 10000 "+"at rate "+i+"% is :" +String.format("%.2f",calculateInterest(10000,i)) );
        }
        for (int i=8;i>1;i--){
            System.out.println("interest for 20000 "+"at rate "+i+"% is :" +String.format("%.2f",calculateInterest(20000,i)) );
        }
        int count =0;
       for(int i=1;i<20;i++){
           if (isPrime(i)) {
               count++;
               System.out.println("Number "+i+" is a prime num");
               if(count==5){
                   System.out.println("exit the loop");
                   break;
               }
           }
       }


    }
    public static double calculateInterest(double amount, double interestRate){
     return amount*(interestRate/100);
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            System.out.println("looping"+i);
            if(n % i == 0){
                System.out.println("enter"+i+" "+(n%i));
                return false;
            }
        }
        System.out.println("ans");
        return true;
    }
}
