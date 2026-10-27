package main.polymorfism;

public class AudioBook extends Media {
    private String narrator;

    public AudioBook(String title, int year, String narrator) {
        super(title, year);
        this.narrator = narrator;
    }

    public String getNarrator() {
        return narrator;
    }

    @Override
    protected void play() {
        System.out.println("Now playing " + title + " Narrator: " + narrator);
    }

    @Override
    protected String getDescription() {
        return "Audio Book Description Here";
    }
}
