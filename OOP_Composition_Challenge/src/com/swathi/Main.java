package com.swathi;

public class Main {

    public static void main(String[] args) {
	Bed bed = new Bed("Classic",4,3,2);
	Lamp lamp = new Lamp("modern",true);
	Floor floor = new Floor("wooden");
    Room bedroom = new Room("BedRoom",bed,lamp,floor);
    bedroom.make();
    }



}
