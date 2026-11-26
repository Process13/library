package main.completebuild;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private Map<String, Book> booksById = new HashMap<>();
    private List<Loan> loanHistory = new ArrayList<>();

    public boolean addBook(Book book) {
        if (booksById.containsKey(book.getId())) {
            return false;
        }
        books.add(book);
        booksById.put(book.getId(), book);
        return true;
    }

    public Book getBookById(String id) {
        return booksById.get(id);
    }

    public List<Book> getSorgtedBooks() {
        List<Book> sortedBooks = new ArrayList<>();
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

    public Set<String> getBorrowers() {
        Set<String> borrowers = new HashSet<>();
        for (Loan loan : loanHistory) {
            borrowers.add(loan.getBorrower());
        }
        return borrowers;
    }

    public boolean borrow(String id, String borrower) {
        Book book = booksById.get(id);
        if (book == null) {
            return false;
        }
        if (!book.borrow()) {
            return false;
        }
        Loan loan = new Loan(book, borrower);
        loanHistory.add(loan);
        return true;
    }
}
