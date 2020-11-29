package com.swathi;

public class Main {

    public static void main(String[] args) {
	    BankAccount JackAccount = new BankAccount();
		//				("123",0.0,"Jack","jack@email.com","091 716 811");

		
		System.out.println(JackAccount.getCustomerName());
		System.out.println(JackAccount.getPhoneNumber());
	    JackAccount.withdrawal(2);
	    JackAccount.deposit(100);
	    JackAccount.withdrawal(25);
		//Vip customer
	    VipCustomer miranda = new VipCustomer("Miranda lin","500","miran@email.com");
	    VipCustomer rose = new VipCustomer("Rose prechet","300");
	    VipCustomer adam = new VipCustomer();

		System.out.println("name "+miranda.getName()+" credit "+miranda.getCreditLimt()+" email "+miranda.getEmailaddress());
		System.out.println("name "+rose.getName()+" credit "+rose.getCreditLimt()+" email "+rose.getEmailaddress());
		System.out.println("name "+adam.getName()+" credit "+adam.getCreditLimt()+" email "+adam.getEmailaddress());
    }
}
