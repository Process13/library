package main.completebuild;

public class Book extends Media{

    private String author;

    public Book(String id, String title, int year, String author) {
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

    public boolean isAvailable() {
        return status == Status.AVAILABLE;
    }

    public boolean borrow(){

        if (status !=  Status.AVAILABLE) {
            return false;
        }
        status = Status.BORROWED;

        return true;
    }


    @Override
    public String toString(){
        return getId() + " | " +  getTitle() + " | " + getAuthor() + " | " + getStatus();
    }


}
