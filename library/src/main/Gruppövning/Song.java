package main.Gruppövning;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String artist;
    private String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Song)) {
            return false;
        }
        Song otherSong = (Song) o;

        return title.equals(otherSong.title);
                //&& getArtist().equals(otherSong.getArtist());
    }

    @Override
    public String toString() {
        return "Titel: " + title + "\nArtist: " + getArtist()+ '\n';
    }

    List<Song> songList = new ArrayList<>();
}
