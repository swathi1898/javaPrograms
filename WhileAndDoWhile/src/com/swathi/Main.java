package com.swathi;

public class Main {

    public static void main(String[] args) {
	int count =1;
	while(count != 6){
        System.out.println("Count value was "+count);
        count++;
    }
        System.out.println("****************************************");
	count=1;
	while (true){
	    if(count==6){
	        break;
        }
        System.out.println("count value was "+ count);
	    count++;
    }
        System.out.println("****************************************");
	count=1;
	do{
        System.out.println("count value was "+ count);
        count++;
    }while(count!=6);
        System.out.println("******************************************");
    int number = 4;
    int finishNumber = 20;
    count =0;
    while (number<=finishNumber){
        number++;
        if (! isEvenNumber(number)){
            continue;
        }
        count++;
        System.out.println("number "+number+" is even number");
        if(count>=5){
            break;
        }
        }
        System.out.println("total even num is "+ count);
    }



    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }return false;

    }



}
