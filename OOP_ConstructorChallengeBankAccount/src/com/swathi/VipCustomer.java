package com.swathi;

public class VipCustomer {

    private String name;
    private String creditLimt;
    private String emailaddress;

    public VipCustomer(){
        this("Default Name","200","default@email.com");
        System.out.println("costructor with empty field");
    }
    public VipCustomer(String name, String creditLimt, String emailaddress) {
        this.name = name;
        this.creditLimt = creditLimt;
        this.emailaddress = emailaddress;
        System.out.println("costructor with all fields");
    }

    public VipCustomer(String name, String creditLimt) {
        this(name,creditLimt,"company@email.com");
        System.out.println("costructor with two fields");
    }

    public String getName() {
        return name;
    }

    public String getCreditLimt() {
        return creditLimt;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
