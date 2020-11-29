package com.swathi;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("567",20.0,"Default name","Default email","Default phone number");
        System.out.println("empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("constructor was called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositeAmount){
        this.balance += depositeAmount;
        System.out.println("Deposite of "+ depositeAmount+" made. New balance is "+ this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <0){
            System.out.println("Only balance is "+this.balance+" available. Withdrawal is not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processes. Remaining balance is "+ this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
