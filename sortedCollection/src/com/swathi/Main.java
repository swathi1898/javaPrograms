package com.swathi;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	StockItem temp = new StockItem("bread", 0.86,100);
	stockList.addStock(temp);

    temp = new StockItem("butter", 4.25,50);
    stockList.addStock(temp);

    temp = new StockItem("cake", 1.86,20);
    stockList.addStock(temp);

    temp = new StockItem("cookies", 1.66,50);
    stockList.addStock(temp);

    temp = new StockItem("eggs", 1.5,3);
    stockList.addStock(temp);

    temp = new StockItem("muffins", 2.25,20);
    stockList.addStock(temp);

    System.out.println(stockList);

    Basket JacksBasket = new Basket("Jack");
    sellItem(JacksBasket,"eggs",1);
        System.out.println(JacksBasket);
    sellItem(JacksBasket,"eggs",2);
        System.out.println(JacksBasket);
    sellItem(JacksBasket,"eggs",1);
    sellItem(JacksBasket,"CHOCOLATES",1);
        sellItem(JacksBasket,"cake",1);
        System.out.println(JacksBasket);

        stockList.Items().get("bread").adjustStock(50);
        System.out.println(stockList);

        Basket basket = new Basket("Customer");
        sellItem(basket,"bread",50);
        sellItem(basket,"cake",1);
        removeItem(basket,"bread",1);
        System.out.println(basket);
        removeItem(JacksBasket,"cookies",1);
        removeItem(JacksBasket,"bread",1);
        removeItem(JacksBasket,"cookies",1);
        System.out.println("cookies removed: "+ removeItem(JacksBasket, "cookies",1));

        System.out.println(JacksBasket);

        removeItem(JacksBasket,"bread",1);
        removeItem(JacksBasket,"cookies",2);
        removeItem(JacksBasket,"muffins",3);
        removeItem(JacksBasket,"butter",1);
        System.out.println(JacksBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        stockList.Items().get("eggs").adjustStock(200);
        stockList.get("eggs").adjustStock(-100);


        checkOut(JacksBasket);
        System.out.println(JacksBasket);


    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+ item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity)!=0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }
    public static int removeItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+ item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity)==quantity){

            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }
    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }


}
