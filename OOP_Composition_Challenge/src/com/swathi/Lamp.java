package com.swathi;

public class Lamp {
    private String style;
    private boolean battery;

    public Lamp(String style, boolean battery) {
        this.style = style;
        this.battery = battery;
    }
    public void turnOn(){
        if(battery)
            System.out.println("Lamp -->turning on");
        else
            System.out.println("Lamp is off");
    }
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }
}
