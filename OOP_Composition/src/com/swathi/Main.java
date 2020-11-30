package com.swathi;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20,20,3);
	    Case theCase = new Case("220B","Dell","240",dimension);
        Monitor theMonitor = new Monitor("27 inch", "Asus", 27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("Bj7","Acer",4,6,"2.4");
        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgran("windows 1.0");
        thePC.getThecase().pressPowerButton();

    }
}
