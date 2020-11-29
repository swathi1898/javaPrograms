package com.swathi;

public class Main {

    public static void main(String[] args) {
	CarType outlander = new CarType(36);
	outlander.steer(45);
	outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.accelerate(-42);
    }
}
