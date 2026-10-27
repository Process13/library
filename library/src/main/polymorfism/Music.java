package main.polymorfism;

public class Music extends Media {
    private String artist;

    public Music(String title, int year, String artist) {
        super(title, year);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    protected void play() {
        System.out.println("Now playing " + title + " by " + artist);
    }

    @Override
    protected String getDescription() {
        return "Music Description Here";
    }
}
