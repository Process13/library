package main.library;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void borrow(){
        if (borrowed) {
            System.out.println(title + " is already borrowed");
            return;
        }
        borrowed = true;
        System.out.println("You have boorowed " + title);
    }

    public void returnBook() {
        if (!borrowed) {
            System.out.println(title +" has not been borrowed yet");
            return;
        }
        borrowed = false;
        System.out.println("Thank you for returning " + title);
    }
}
