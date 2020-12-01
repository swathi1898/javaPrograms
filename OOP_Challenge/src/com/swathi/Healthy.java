package com.swathi;

public class Healthy extends Hamburger {
    private String healthyItem1;
    private double healthyItem1Price;
    private String healthyItem2;
    private double healthyItem2Price;

    public Healthy( String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }
    public void healthyAdditionItem1(String name, double price){
        this.healthyItem1 = name;
        this.healthyItem1Price = price;
    }
    public void healthyAdditionItem2(String name, double price){
        this.healthyItem2 = name;
        this.healthyItem2Price = price;
    }

    @Override
    public double getHamburgerPrice() {
        double hamburgerPrice = super.getHamburgerPrice();
        if(this.healthyItem1 != null){
            hamburgerPrice += this.healthyItem1Price;
            System.out.println("addition "+ this.healthyItem1 +" for extra is "+ this.healthyItem1Price);
        }
        if(this.healthyItem2 != null){
            hamburgerPrice += this.healthyItem2Price;
            System.out.println("addition "+ this.healthyItem2 +" for extra is "+ this.healthyItem2Price);
        }
        return hamburgerPrice;
    }
}
