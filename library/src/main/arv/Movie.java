package main.arv;

public class Movie extends TimedMedia {
    public Movie(String title, String creator, String genre, int year, boolean borrowed, int runtime) {
        super(title, creator, genre, year, borrowed, runtime);
    }
}
