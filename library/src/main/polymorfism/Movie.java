package main.polymorfism;

public class Movie extends Media implements Borrowable{
    private int duration;

    public Movie(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    protected void play() {
        System.out.println("Now playing " + title + " Duration: " + duration);
    }

    @Override
    protected String getDescription() {
        return "Movie Description Here";
    }

    public void showTrailer() {
        System.out.println("EPIC TRAILER HERE!");

    }

    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
