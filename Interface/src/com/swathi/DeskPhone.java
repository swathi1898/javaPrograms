package com.swathi;

public class DeskPhone implements ITelephone{
    private int muNumber;
    private boolean isRinging;

    public DeskPhone(int muNumber) {
        this.muNumber = muNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println( "Now ringing "+ phoneNumber+" on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering.....");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
    if(phoneNumber == muNumber){
        isRinging= true;
        System.out.println("Ring ring....");
    }else{
        isRinging =false;
    }
    return isRinging;
    }

    @Override
    public boolean isRinging() {
      return isRinging;
    }
}
