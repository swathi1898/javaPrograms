package com.swathi;

import com.swathi.model.Artist;
import com.swathi.model.ArtistList;
import com.swathi.model.DataSource;
import com.swathi.model.SongArtist;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new DataSource();
        if(!dataSource.open()){
            System.out.println("can't open data source");
            return;
        }
        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if(artists == null){
            System.out.println("No artists");
            return;
        }
        for(Artist artist: artists){
            System.out.println("ID = "+artist.getId()+", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                dataSource.queryAlbumsForArtists("Carole King", DataSource.ORDER_BY_ASC);
        for(String album : albumsForArtist){
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("Go Your Own Way",2);
        if(songArtists == null){
            System.out.println("Couldn't find artist for the song");
            return;
        }
        for (SongArtist artist : songArtists){
            System.out.println("Artist name = "+ artist.getArtistName()+
                    " Album name = "+ artist.getAlbumName()+
                    " Track = "+ artist.getTrack());
        }



    dataSource.querySongsMetadata();

        int count = dataSource.getCount(DataSource.TABLE_SONGS);
        System.out.println("Number of songs: "+count);

        dataSource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();


        songArtists = dataSource.querySongInfoView(title);
        if(songArtists.isEmpty()){
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for(SongArtist artist : songArtists){
            System.out.println("From VIEW - Artist name = "+ artist.getArtistName()+
                    " Album name = "+ artist.getAlbumName()+
                    " Track number " + artist.getTrack());
        }

//        List<ArtistList> artistLists = dataSource.QuerycreateViewForSongArtists();
//        if(artistLists == null){
//            System.out.println("Couldn't find artist_list ");
//            return;
//        }
//        for (ArtistList artistlist : artistLists){
//            System.out.println("Artist name = "+ artistlist.getArtistName()+
//                    " Album name = "+ artistlist.getAlbumName()+
//                    " Track = "+ artistlist.getTrack()+
//                    " Title "+ artistlist.getTitle());
//        }


        dataSource.insertSong("Touch of Grey","Grateful Dead", "In The Dark",1);


        dataSource.close();
    }
}
