package com.swathi;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50,true);
        System.out.println("Initial page count = "+ printer.getNumberOfPagesPrinted());
        int printPages = printer.printPages(4);
        System.out.println("Pages printed was "+ printPages+" new total print count for printer "+ printer.getNumberOfPagesPrinted());
        printPages = printer.printPages(2);
        System.out.println("Pages printed was "+ printPages+" new total print count for printer "+ printer.getNumberOfPagesPrinted());


        System.out.println(""+printer.addToner(5));

    }
}
