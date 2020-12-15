package com.swathi;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Ocean","Billie Eilish");
        album.addSong("Ocean",5.30);
        album.addSong("Po ne Po",5.20);
        album.addSong("vaan",4.30);
        album.addSong("un vizhigal",3.25);
        album.addSong("kadhal kaditham",4.50);
        albums.add(album);

        album= new Album("For Those","AC/DC");
        album.addSong("lalala",4.25);
        album.addSong("dina",5.24);
        album.addSong("happy",4.32);
        album.addSong("feel ",3.58);
        albums.add(album);

        LinkedList<Songs> playlist = new LinkedList<Songs>();
        albums.get(0).addToPlaylist("vaan",playlist);
        albums.get(0).addToPlaylist("lolita",playlist);
        albums.get(0).addToPlaylist(2,playlist);
        albums.get(0).addToPlaylist("Ocean",playlist);
        albums.get(0).addToPlaylist(4,playlist);
        albums.get(1).addToPlaylist(1,playlist);
        albums.get(1).addToPlaylist(2,playlist);
        albums.get(1).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist(4,playlist);
        albums.get(0).addToPlaylist(9,playlist);

    play(playlist);

    }
    private static void play(LinkedList<Songs> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Songs> listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("no songs in the playlist");
            return;
        }else {
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward =false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward =false;
                        }else{
                            System.out.println("We are at the start of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the playlist");
                        }
                    }

                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing"+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available action:\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions\n"+
                "6 - delete current song\n");
    }
    private static void printList(LinkedList<Songs> playlist){
        Iterator<Songs> iterator = playlist.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }

}
