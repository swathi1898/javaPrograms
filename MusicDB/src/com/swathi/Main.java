package com.swathi;

import com.swathi.model.Artist;
import com.swathi.model.DataSource;
import com.swathi.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
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

        dataSource.close();
    }
}
