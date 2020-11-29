package com.swathi;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,2,5,5);
        Dog dog = new Dog("yoki",4,5,2,4,1,"labardor");

        System.out.println(dog.getName());
        dog.eat();
        dog.move();
    }
}
