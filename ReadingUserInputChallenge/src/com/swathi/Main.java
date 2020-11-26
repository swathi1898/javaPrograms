package com.swathi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            int order = count+1;
            System.out.println("EnterNumber #"+order+":");

            boolean ishasInt = scanner.hasNextInt();
            if(ishasInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
                if(count==10){
                    break;
                }
            }else{
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("sum = "+sum);
        scanner.close();

    }
}
