package main.arv;

public class TimedMedia extends Media {
    int runtime;

    public TimedMedia(String title, String creator, String genre, int year, boolean borrowed, int runtime) {
        super(title, creator, genre, year, borrowed);
        this.runtime = runtime;
    }
}
