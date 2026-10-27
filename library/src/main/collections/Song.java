package main.collections;

public class Song {
    private String title;
    private String artist;
    private int seconds;

    public Song(String title, String artist, int seconds) {
        this.title = title;
        this.artist = artist;
        this.seconds = seconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Song)) {
            return false;
        }
        Song otherSong = (Song) o;

        return title.equals(otherSong.title)
                && artist.equals(otherSong.artist)
                && seconds == otherSong.seconds;
    }

    public int hashCode() {
        return title.hashCode()
                + artist.hashCode()
                + Integer.hashCode(seconds);
    }

    @Override
    public String toString() {
        return title + " " + artist + " " + seconds + "s";
    }
}
