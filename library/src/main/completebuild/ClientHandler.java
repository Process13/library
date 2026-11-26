package main.completebuild;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;

public class ClientHandler implements Runnable {
    private Socket socket;
    private Library library;

    public ClientHandler(Socket socket, Library library) {
        this.socket = socket;
        this.library = library;
    }

    @Override
    public void run() {
        try (Socket client = socket) {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            String name = in.readLine();

            if (name == null || name.isBlank()) {
                return;
            }
            out.println("Välkommen " + name + "\nKommandon: LIST, STATUS id, BORROW id, QUIT");
            String line;
            while ((line = in.readLine()) != null) {
                String[] parts = line.trim().split(" ", 2);
                String command = parts[0].toUpperCase();
                if (command.equalsIgnoreCase("QUIT")) {
                    out.println("Bye bye");
                    break;
                } else if (command.equalsIgnoreCase("LIST")) {
                    out.println("KATALOG");
                    for (Media media : library.getSorted()) {
                        out.println(media);
                    }
                    out.println("END");
                } else if (command.equalsIgnoreCase("BORROW")) {
                    boolean success = library.borrow(parts[1], name);
                    out.println(success ? "Okej utlånat" : "Fel. Boken är inte inne eller saknas.");
                } else if (command.equalsIgnoreCase("STATUS")) {
                    Media media = library.getMediaById(parts[1]);
                    if (media == null) {
                        out.println("ERROR okänt ID");
                    } else {
                        out.println("OK " + media);
                    }
                } else {
                    out.println("Error, okänt kommando");
                }
            }
        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
