package com.swathi;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Team> teams;
//        Collections.sort(teams);

        League<Team<com.example.game.FootballPlayer>> footballLeague = new com.example.game.League<>("AFL");
        Team<com.example.game.FootballPlayer> gems = new com.example.game.Team<>("Gems");
        Team<com.example.game.FootballPlayer> melbourne = new com.example.game.Team<>("Melbourne");
        Team<com.example.game.FootballPlayer> hawthorn = new com.example.game.Team<>("hawthrone");
        Team<com.example.game.FootballPlayer> mantle = new com.example.game.Team<>("Mantle");
        Team<com.example.game.BaseballPlayer> baseballTeam = new com.example.game.Team<>("Jerfy club");

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
