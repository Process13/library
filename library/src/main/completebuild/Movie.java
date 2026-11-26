package main.completebuild;

public class Movie extends Media{
    private String director;
    private int duriationMinutes;

    public Movie(String id, String title, String director, int year, int duriationMinutes) {
        super(id, title, year);
        this.director = director;
        this.duriationMinutes = duriationMinutes;
    }

    public String getDirector() {
        return director;
    }

    public int getDuriationMinutes() {
        return duriationMinutes;
    }

    @Override
    public int loanDays() {
        return 7;
    }

    @Override
    public String toString(){
        return getId() + " | " +  getTitle() + " | " + getDirector() + " | " + getDuriationMinutes() + " | " + getStatus();
    }
}
