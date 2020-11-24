package com.swathi;

public class Main {

    public static void main(String[] args) {

        int count =0;
        int sum = 0;
        for(int i=1; i<=1000; i++){
            if((i%3==0) && (i%5==0)){
                count++;
                sum += i;
                System.out.println("number divisible by 3 and 5 is "+i);

                if(count==5){
                    System.out.println("sum of numbers is "+sum);
                    break;
                }

            }


        }
    }
}
