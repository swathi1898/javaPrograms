package com.swathi;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Delux burger", "White roll", "2x sausage", 10.75);
        super.addAdditionalItem1("Cheese",2.5);
        super.addAdditionalItem2("egg",2.25);
    }

    @Override
    public void addAdditionalItem1(String name, Double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAdditionalItem2(String name, Double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAdditionalItem3(String name, Double price) {
        System.out.println("Cannot add additional items");
    }

    @Override
    public void addAdditionalItem4(String name, Double price) {
        System.out.println("Cannot add additional items");
    }
}
