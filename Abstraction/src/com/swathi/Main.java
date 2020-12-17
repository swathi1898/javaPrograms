package com.swathi;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("kera");
	dog.breathe();
	dog.eat();

	Parrot parrot = new Parrot(("white"));
	parrot.breathe();
	parrot.eat();
	parrot.fly();
	Penguin penguin = new Penguin("Emperor");
	penguin.fly();



    }

}
