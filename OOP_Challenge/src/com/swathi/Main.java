package com.swathi;

public class Main {

    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic","sliced bread","chiken sausage",4);
    hamburger.addAdditionalItem1("Cheese",0.5);
        System.out.println("total "+ hamburger.getHamburgerPrice());

    Healthy healthyburger = new Healthy("chiken sausage",5.25);
    healthyburger.addAdditionalItem1("lettuce",0.50);
    healthyburger.healthyAdditionItem1("tomato",1.25);
        System.out.println("Total "+healthyburger.getHamburgerPrice());

    DeluxBurger db = new DeluxBurger();
    db.getHamburgerPrice();
        System.out.println("Total "+ db.getHamburgerPrice());

    }
}
