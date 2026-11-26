package main.completebuild;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1", "Pippi långstrump", "Astrid Lindgren", 1945));
        library.addBook(new Book("2", "Sagan om ringen", "Tolken", 1950));
        library.addBook(new Book("3", "Asterix ock Obelix", "Minns ej", 3));
        library.addBook(new Book("4", "Javautveckling", "Någon", 1234));

        System.out.println("Katalog före lån");
        for (Book book : library.getSorgtedBooks()){
            System.out.println(book);
        }

        System.out.println("Lån lyckades");
        for (Book book : library.getSorgtedBooks()){
            System.out.println(book);
        }


    }
}
/*
TODO
1-Klasser och objekt DONE
2-TDD DONE
3-ENUM DONE
4-Objektsamverkan
5-Collection
6-Arv, Interface och polymorfism



 */