package com.swathi;

public class Hamburger {
   private String name;
   private String breadRollType;
   private String meat;
   private double price;

   private String additionalItem1;
   private double additionalItem1Price;
    private String additionalItem2;
    private double additionalItem2Price;
    private String additionalItem3;
    private double additionalItem3Price;
    private String additionalItem4;
    private double additionalItem4Price;


    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditionalItem1(String name, Double price){
        this.additionalItem1 = name;
        this.additionalItem1Price = price;
    }
    public void addAdditionalItem2(String name, Double price){
        this.additionalItem2 = name;
        this.additionalItem2Price = price;
    }
    public void addAdditionalItem3(String name, Double price){
        this.additionalItem3 = name;
        this.additionalItem3Price = price;
    }
    public void addAdditionalItem4(String name, Double price){
        this.additionalItem4 = name;
        this.additionalItem4Price = price;
    }
    public double getHamburgerPrice(){
        double hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRollType+" with "+ this.meat + " price is "+ this.price);
        if(additionalItem1!=null){
            hamburgerPrice += this.additionalItem1Price;
            System.out.println("addition "+ this.additionalItem1 +" for extra is "+ this.additionalItem1Price);
        }
        if(additionalItem2!=null){
            hamburgerPrice += this.additionalItem2Price;
            System.out.println("addition "+ this.additionalItem2 +" for extra is "+ this.additionalItem2Price);
        }
        if(additionalItem3!=null){
            hamburgerPrice += this.additionalItem3Price;
            System.out.println("addition "+ this.additionalItem3 +" for extra is "+ this.additionalItem3Price);
        }
        if(additionalItem4!=null){
            hamburgerPrice += this.additionalItem4Price;
            System.out.println("addition "+ this.additionalItem4 +" for extra is "+ this.additionalItem4Price);
        }
        return hamburgerPrice;
    }

}
