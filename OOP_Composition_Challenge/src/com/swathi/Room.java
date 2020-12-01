package com.swathi;

public class Room {
    private String name;
    private Bed bed;
    private Lamp lamp;
    private Floor floor;

    public Room(String name, Bed bed, Lamp lamp, Floor floor) {
        this.name = name;
        this.bed = bed;
        this.lamp = lamp;
        this.floor = floor;
    }
    public void make(){
        bed.make();
        lampOn();
    }
    private void lampOn(){
        lamp.turnOn();
    }

}

