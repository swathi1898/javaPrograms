package com.swathi;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);

//        System.out.println("toner level is "+printer.addToner(1));
//        System.out.println("pages to print "+ printer.printPages(50));
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = "+ printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted+" new total print count = "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted+" new total print count = "+printer.getPagesPrinted());

    }
}
