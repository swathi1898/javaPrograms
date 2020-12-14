package com.swathi;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("National bank");
	bank.addBranch("Goa");
	bank.addCustomer("Goa","bob",100);
	bank.addCustomer("Goa","tim",500);
	bank.addCustomer("Goa","rose",1000);
	bank.addBranch("che");
	bank.addCustomer("che","guru",200);
    bank.addCustomerTransaction("Goa","tim",50);
    bank.addCustomerTransaction("Goa","rose",100);
    bank.addCustomerTransaction("Goa","tim",50.50);

    bank.listCustomers("Goa",true);
    }
}
