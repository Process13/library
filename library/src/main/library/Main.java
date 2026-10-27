package main.library;

import java.util.Scanner;

public class Main {

    private static Library library = new Library("Hundrade Biblioteket");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        addStartBooks();
        boolean running = true;
        while (running) {
            showMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": addBook(); break;
                case "2": library.printAllBooks(); break;
                default:
                    System.out.println("Choice invalid. Try again.");
            }
        }
    }

    private static void addStartBooks() {
        library.addBook(new Book("Pippi", "Astrid Lindgren", 1945));
        library.addBook(new Book("Ronja Rövardotter", "Astrid Lindgren", 1950));
    }

    private static void showMenu() {
        System.out.println("1. Add a library.arv.Book\n2. Show all books");
    }

    private static void addBook() {
        System.out.println("library.arv.Book title: ");
        String title = scanner.nextLine().trim();

        System.out.println("Author: ");
        String author = scanner.nextLine().trim();

        System.out.println("Year: ");
        String year = scanner.nextLine().trim();
        int bookYear = Integer.parseInt(year);

        library.addBook(new Book(title, author, bookYear));
        System.out.println(title + " by " + author + " has been added.");
    }
}