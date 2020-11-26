package com.swathi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Parsing value as string
        System.out.println("Parsing value as string");
        String numberAsString = "2018";
        System.out.println("Number is "+numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = "+number);

        numberAsString +=1;
        number +=1;
        System.out.println("Number as string "+numberAsString);
        System.out.println("number = "+ number);
        System.out.println("--------------------------------------");
        //Reading user input


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name ");
            String name = scanner.nextLine();
            int age = 2020-yearOfBirth;
            if(age>=0 && age<=100){
                System.out.println("your name is "+name+" and you are "+age+" years old.");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }





        scanner.close();

    }
}
