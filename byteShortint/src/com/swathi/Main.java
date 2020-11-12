package com.swathi;

public class Main {

    public static void main(String[] args) {
	int intValue = 100;
	byte byteValue = 20;
	short shortValue = 5000;
	byte newByteValue =(byte) (byteValue/2);

	long totalLongValue =  50000L +(10L *(intValue + newByteValue + shortValue));
	//50000 + 10 *(100+10+5000) = 101100
	short totalShortValue = (short) (1000 + (intValue + newByteValue + shortValue));
	//1000 + (100 + 10 + 5000) = 6110

        System.out.println("TotalLongValue = "+ totalLongValue);
		System.out.println("TotalShortValue = "+ totalShortValue);
    }
}
