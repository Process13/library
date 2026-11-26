package main.completebuild;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LibraryServer {
    static void main(String[] args) {
        Library library = new Library();
        library.addMedia(new Book("1", "Pippi Långstrump", "Astrid", 1945));
        library.addMedia(new Book("2", "Ronja Rövardotter", "Astrid", 1945));
        library.addMedia(new Book("3", "Emil i Lönneberga", "Astrid", 1945));
        library.addMedia(new Movie("4", "Star Wars", "George Lukas", 1982, 300));

        try (ServerSocket server = new ServerSocket(5000)){
            System.out.println("Servern stardad på port 5000");
            while (true){
                Socket socket = server.accept();
                ClientHandler handler = new ClientHandler(socket, library);
                handler.run();
            }
        }catch (IOException e){
            System.out.println("Serverfel: " + e.getMessage());
        }
    }
}
