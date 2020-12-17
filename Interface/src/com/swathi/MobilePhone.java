package com.swathi;

public class MobilePhone implements ITelephone{
    private int muNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int muNumber) {
        this.muNumber = muNumber;
    }

    @Override
    public void powerOn() {
        isOn= true;
        System.out.println("Mobile phone is powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println( "Now ringing "+ phoneNumber+" on Mobile phone");
        }else {
            System.out.println("phone is switched off");
        }
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
        if(phoneNumber == muNumber && isOn ){
            isRinging= true;
            System.out.println("melody ring....");
        }else{
            isRinging =false;
            System.out.println("Mobile phone is not on Or invalid mobile number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}