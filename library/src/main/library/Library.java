package main.library;

public class Library {
    private String name;
    private Book[] books = new Book[100];
    private int count = 0;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        if (count == books.length) {
            System.out.println("The shelf is full");
            return;
        }
        books[count] = book;
        count++;
    }

    public void printAllBooks() {
        for (int i = 0; i<count; i++) {
            System.out.println(books[i]);
        }
    }
}
