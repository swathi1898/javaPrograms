package com.swathi;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() +" Items in your grocery list");
        for(int i =0;i<groceryList.size();i++){
            System.out.println((i+1)+ ", "+ groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1)+" has been modified");
    }

}
