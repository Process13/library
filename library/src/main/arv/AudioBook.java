package main.arv;

public class AudioBook extends TimedMedia {
    public AudioBook(String title, String creator, String genre, int year, boolean borrowed, int runtime) {
        super(title, creator, genre, year, borrowed, runtime);
    }
}
