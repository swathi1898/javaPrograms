package com.swathi;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
//	    porsche.model = "carrera";
        porsche.setModel("carrera");

        System.out.println("Model is "+ porsche.getModel());
    }
}
