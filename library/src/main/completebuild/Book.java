package main.completebuild;

public class Book extends Media{

    private String author;

    public Book(String id, String title, String author, int year) {
        super(id, title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int loanDays(){
        return 28;
    }

    @Override
    public String toString(){
        return getId() + " | " +  getTitle() + " | " + getAuthor() + " | " + getStatus();
    }


}
