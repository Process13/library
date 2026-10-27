package main.arv;

public class Media {
    String title;
    String creator;
    String genre;
    int year;
    private boolean borrowed;

    public Media(String title, String creator, String genre, int year, boolean borrowed) {
        this.title = title;
        this.creator = creator;
        this.genre = genre;
        this.year = year;
        this.borrowed = borrowed;
    }

    public int borrow() {
        return 7;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    protected void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean isAvailable() {
        return !borrowed;
    }

}
