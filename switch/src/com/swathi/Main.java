package com.swathi;

public class Main {

    public static void main(String[] args) {
        switchStatement();

    }



    public static void switchStatement(){
        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        char switchCharValue = 'H';
        switch (switchCharValue){
            case 'A':
                System.out.println("this is a alphabet A");
                break;
            case 'B':case 'C':case 'D':case 'E':
                System.out.println("this is a alphabet B or C or D or E");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
