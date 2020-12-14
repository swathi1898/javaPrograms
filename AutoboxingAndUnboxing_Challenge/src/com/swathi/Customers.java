package com.swathi;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions ;

    public Customers(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    //    public double transaction(Double transactions){
//        this.transactions.add(Double.valueOf(transactions));
//        for(int i =0;i<this.transactions.size();i++){
//            double transactionAmount = this.transactions.get(i).doubleValue();
//            return transactionAmount;
//        }
//
//    }
//    public void CreateAccount(String name,Double transactions){
//        for(double dbl = 0; dbl<1)
//        return new Customers(name,);
//    }
//    public Double debit(double debitamount){
//        System.out.println(debitamount+" debited into your account");
//        return debitamount;
//    }




}
