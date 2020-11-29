package com.swathi;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity =0;
        this.currentDirection= 0;

    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("current direction is " + this.currentDirection +" degree");
    }

    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection= direction;
        System.out.println("vehicle.move() is moving at "+ this.currentVelocity + " in "+this.currentDirection+" degree direction");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity = 0;
    }

}
