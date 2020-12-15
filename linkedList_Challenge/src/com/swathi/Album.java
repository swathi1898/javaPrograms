package com.swathi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Songs> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Songs>();
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Songs(title,duration));
            return true;
        }
        return false;
    }
    private Songs findSong(String title){
        for(Songs checkedSong: this.songs){
             if(checkedSong.getTitle().equals(title)){
                 return checkedSong;
             }
        }
        return null;
    }
    public boolean addToPlaylist(int trackNumber, LinkedList<Songs> playlist){
        int index = trackNumber -1;
        if((index>=0)&&(index<= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have a track "+ trackNumber);
        return false;

    }
    public boolean addToPlaylist(String title,LinkedList<Songs> playlist){
        Songs checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" was not in the album");
        return false;
    }






}


