package com.swathi;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(4);
        printDayOfTheWeek("MOnday");
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid value");
                break;
        }
    }
    public static void printDayOfTheWeek(String day){
        day = day.toLowerCase();

        if(day.equals("sunday")){
            System.out.println("its sunday");
        }else  if(day.equals("monday")){
            System.out.println("its monday");
        }else  if(day.equals("tuesday")){
            System.out.println("its tuesday");
        }else  if(day.equals("wednesday")){
            System.out.println("its wednesday");
        }else  if(day.equals("thursday")){
            System.out.println("its thursday");
        }else  if(day.equals("friday")){
            System.out.println("its friday");
        }else  if(day.equals("saturday")){
            System.out.println("its saturday");
        }else{
            System.out.println("invalid data");
        }

    }
}
