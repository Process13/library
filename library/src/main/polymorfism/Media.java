package main.polymorfism;

public abstract class Media {
    protected String title;
    protected int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void showInfo() {
        System.out.println('\n' + title + " från " + year + " " + getDescription());
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    protected abstract void play();

    protected abstract String getDescription();
}
