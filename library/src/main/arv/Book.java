package main.arv;

public class Book extends Media {


    //Unik för bok
    int page;

    public Book(String title, String creator, String genre, int year, boolean borrowed, int page) {
        super(title, creator, genre, year, borrowed);
        this.page = page;
    }

    @Override
    public int borrow() {
        int days = super.borrow();
        System.out.println("From parent class " + days);
        return 14+days;
    }
}
