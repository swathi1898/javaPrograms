package com.swathi;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDuration(70,90));
        System.out.println(getDuration(756));
    }
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDuration(int minutes,int second){
        if(minutes>=0 && ((second>=0) &&(second <=59))){
            int hour = minutes/60;
            int remainingMin = minutes%60;

            String hourString = hour + "h";
            if(hour<10){
                hourString = "0"+hourString;
            }
            String minString = remainingMin + "m";
            if(minutes<10){
                minString = "0"+minString;
            }
            String secString = second + "s";
            if(second<10){
                secString = "0"+secString;
            }

            return (hourString+" "+minString+" "+secString) ;
        }else{
            return INVALID_VALUE_MESSAGE;
        }
    }
    public static String getDuration(int second){
        if(second >0){
            int minutes = second/60;
            int remainingSec = second%60;
            return getDuration(minutes,remainingSec);
        }return INVALID_VALUE_MESSAGE;
    }
}
