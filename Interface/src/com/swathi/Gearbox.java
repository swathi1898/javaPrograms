package com.swathi;

public class Gearbox {
    private boolean clutchIn;
    public void operate(String inOrOut){
        this.clutchIn = inOrOut.equalsIgnoreCase("in");
    }
//    or
    public void operate(boolean inOrOut){
        this.clutchIn = inOrOut;
    }
}
