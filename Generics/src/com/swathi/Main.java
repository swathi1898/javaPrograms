package com.swathi;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

//    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        printDoubled(items);
//
//    }
//    private static void printDoubled(ArrayList<Integer> n){
//        for(int i:n){
//            System.out.println(i*2);
//        }
//    }
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer tom = new BaseballPlayer("Tom");
        SoccerPlayer adam = new SoccerPlayer("Adam");

        Team<FootballPlayer> gems = new Team<>("Gems");
        gems.addPlayer(joe);
//        gems.addPlayer(tom);
//
//        gems.addPlayer(adam);
        System.out.println(gems.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<>("Jerfy club");
        baseballTeam.addPlayer(tom);
        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(adam);
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Jack");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("hawthrone");
        Team<FootballPlayer> mantle = new Team<>("Mantle");
        hawthorn.matchResult(mantle,1,0);
        hawthorn.matchResult(gems,3,8);
        gems.matchResult(mantle,2,1);
//        gems.matchResult(baseballTeam,1,1);
        System.out.println("Rankings");
        System.out.println(gems.getName()+": "+gems.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(mantle.getName()+": "+mantle.ranking());;
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());


        System.out.println(gems.compareTo(melbourne));
        System.out.println(gems.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(gems));
        System.out.println(melbourne.compareTo(mantle));



    }

}
