package main.completebuild;

import static main.completebuild.Utility.showCatalog;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addMedia(new Book("1", "Pippi långstrump", "Astrid Lindgren", 1945));
        library.addMedia(new Book("2", "Sagan om ringen", "Tolken", 1950));
        library.addMedia(new Book("3", "Asterix ock Obelix", "Minns ej", 3));
        library.addMedia(new Book("4", "Javautveckling", "Någon", 1234));

        System.out.println("Katalog före lån");
        showCatalog(library);

        System.out.println("Lån lyckades");

        System.out.println("Katalog efter lån");
        showCatalog(library);


    }
}
/*
TODO
1-Klasser och objekt DONE
2-TDD DONE
3-ENUM DONE
4-Objektsamverkan DONE
5-Collection DONE
6-Arv, Interface och polymorfism DONE
7-Refactor, logging, felsökning DONE
8- Nätverk, client & server



 */