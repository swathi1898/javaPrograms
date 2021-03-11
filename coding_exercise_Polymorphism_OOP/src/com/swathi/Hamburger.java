package com.swathi;

public class Hamburger {
    private String name;
    private String meat;
    private Double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private Double addition1Price;
    private Double addition2Price;
    private Double addition3Price;
    private Double addition4Price;

    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public  void addHamburgerAddition1(String name, Double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public  void addHamburgerAddition2(String name, Double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public  void addHamburgerAddition3(String name, Double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public  void addHamburgerAddition4(String name, Double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
  public double itemizehamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name+" Hamburger with "+this.meat+" and "+this.breadRollType+" costs "+this.price);
        if(addition1Name!=null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Addition "+ this.addition1Name+"\n"+
                                "Total Costs = "+hamburgerPrice);
        }
      if(addition2Name!=null){
          hamburgerPrice += this.addition2Price;
          System.out.println("Addition "+ this.addition2Name+"\n"+
                  "Total Costs = "+hamburgerPrice);
      }
      if(addition3Name!=null){
          hamburgerPrice += this.addition3Price;
          System.out.println("Addition "+ this.addition3Name+"\n"+
                  "Total Costs = "+hamburgerPrice);
      }
      if(addition4Name!=null){
          hamburgerPrice += this.addition4Price;
          System.out.println("Addition "+ this.addition4Name+"\n"+
                  "Total Costs = "+hamburgerPrice);
      }
      return hamburgerPrice;
  }

}
