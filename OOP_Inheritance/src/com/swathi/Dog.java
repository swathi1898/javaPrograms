package com.swathi;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private String breed;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String breed) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs= legs;
        this.tail = tail;
        this.breed = breed;
    }
    private void chew(){
        System.out.println("dog.chew() is called");
    }
    private void moveLeg(){
        System.out.println("dog.moveLEg()");
    }

    @Override
    public void eat() {
        System.out.println("dog,eat()");
        chew();
        super.eat();
    }
    public void move() {
        System.out.println("dog.move()");
        moveLeg();
        move(5);
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.moveed()");
        super.move(speed);
    }
}
