package com.swathi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Goa");
//        placesToVisit.add("Berlin");
//        placesToVisit.add("Moscow");
//        placesToVisit.add("Tokyo");
//        placesToVisit.add("China");
//        placesToVisit.add("Agra");
//
//        printList(placesToVisit);
//        placesToVisit.add(1,"Chennai");
//        printList(placesToVisit);
//        placesToVisit.remove(6);
//        printList(placesToVisit);

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Goa");
        addInOrder(placesToVisit,"Berlin");

        addInOrder(placesToVisit,"Chennai");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Goa");
        printList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        System.out.println("newCity is "+newCity);
        while (stringListIterator.hasNext()){
            int comparsion = stringListIterator.next().compareTo(newCity);
            System.out.println(comparsion);
            if(comparsion==0){
                System.out.println(newCity+" already exist in the list ;)");
                return false;
            }else if(comparsion>0){
                stringListIterator.previous();
                System.out.println("is greater and new city "+ newCity+" is added");
                stringListIterator.add(newCity);
                return true;
            }else if(comparsion<0){
                System.out.println("lesser");
            }
        }
        System.out.println("printing new city");
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("no vities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward= false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                "1 - go to next city\n"+
                "2 - go to previous city\n"+
                "3 - print menu options\n");
    }
}
