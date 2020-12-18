package com.swathi;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Team> teams;
//        Collections.sort(teams);

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> gems = new Team<>("Gems");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("hawthrone");
        Team<FootballPlayer> mantle = new Team<>("Mantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Jerfy club");

        hawthorn.matchResult(mantle,1,0);
        hawthorn.matchResult(gems,3,8);
        gems.matchResult(mantle,2,1);
        
        footballLeague.add(gems);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(mantle);

        footballLeague.showLeagueTable();

    }
}
