package com.swathi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("944 542 8556");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        while(!quit){
            System.out.println("\n enter a choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    System.out.println("shutting down................");
                    quit = false;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printMenu();
                    break;


            }
            System.out.println("choose 6 for menu");
        }
    }
    public static void printMenu(){
        System.out.println("\nMenu available:\n Press");
        System.out.println("0 - to shutdown \n"+
                            "1 - to print contacts\n"+
                            "2 - to add a new contact\n"+
                            "3 - to update existing contact\n"+
                            "4 - to remove an existing contact\n"+
                            "5 - query an existing contact\n"+
                            "6 - to print the list of menus available");

    }
    public static void addContact(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter Phone number:");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new contact name:"+name+" phone number:"+phoneNumber+" was added.");
        }else{System.out.println("Cannot add contact "+name+" already exists");}


    }
    public static void updateContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("successfully updated");
        }else{
            System.out.println("error");
        }
    }
    public static void removeContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("successfully removed");
        }else{
            System.out.println("error");
        }
    }
    public static void queryContact(){
        System.out.println("enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("name: "+existingContact.getName()+" phone number: "+existingContact.getPhoneNumber());
    }
}
