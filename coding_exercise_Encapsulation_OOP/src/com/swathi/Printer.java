package com.swathi;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = Math.max(tonerLevel, -1);
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<100){
            if (this.tonerLevel + tonerAmount > 100)
                return -1;

            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
        
    }
    public int printPages(int pages){
        if (pages < 0)
            return -1;
        int pagesToPrint;
        if (!duplex) {
            pagesToPrint = pages;
        } else {
            pagesToPrint = pages / 2 + (pages % 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }
    public int getPagesPrinted(){
       return this.pagesPrinted;
    }
}
