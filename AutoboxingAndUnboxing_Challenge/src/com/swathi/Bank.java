package com.swathi;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branches> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branches>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branches(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName,String customerName, double initialAmount){
        Branches branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branches branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    public Branches findBranch(String branchName){
        for(int i =0;i<this.branches.size();i++){
            Branches checkBranch = this.branches.get(i);
            if(checkBranch.getName().equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branches branch = findBranch(branchName);
        if(branch!= null){
            System.out.println("customer details for the branch "+ branch.getName());

            ArrayList<Customers> branchCustomers = branch.getCustomers();
            for(int i =0; i<branchCustomers.size();i++){
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println("Customer "+ branchCustomer.getName()+"["+(i+1)+"]");
                if(showTransaction){
                    System.out.println("Transactions ");
                    ArrayList<Double> transaction = branchCustomer.getTransactions();
                    for(int j = 0; j<transaction.size();j++){
                        System.out.println(("["+(j+1)+"] Amount "+ transaction.get(j)));
                    }
                }
            }
            return true;
        }else{
            return false;
        }

    }





    
}
