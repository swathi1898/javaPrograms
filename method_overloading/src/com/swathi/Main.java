package com.swathi;

public class Main {

    public static void main(String[] args) {

    calFeetAndInchesToCentimeter(5,8);
    calFeetAndInchesToCentimeter(158);
    }
    public static double calFeetAndInchesToCentimeter( double feet, double inches){
        if((feet >= 0)&& (inches>=0 && inches<=12)){
            double centimeter =  ((feet * 12)*2.54) +  (inches * 2.54);
            System.out.println(feet+" feet, "+inches+" inches is "+centimeter);
            return (centimeter );
        }else{
            System.out.println("invalid");
            return -1;
        }

    }
    public static double calFeetAndInchesToCentimeter(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int)(inches/12);
        double remaininginches =(int)inches%12;
        System.out.println(inches+" inches = "+feet+" feet and " +remaininginches+" inches");
        return calFeetAndInchesToCentimeter(feet,remaininginches);
    }

}
