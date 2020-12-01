package com.swathi;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel>-1&& tonerLevel<=100){
            this.tonerLevel =tonerLevel;
        }else {
            this.tonerLevel =-1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel + tonerAmount >100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint = pages/2 + pages%2;
            System.out.println("printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
