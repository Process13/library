package main.errorhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Path path = Path.of("users.txt");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String line;
            while ((line=reader.readLine())!=null){
                String[] parts = line.split(":");

                System.out.println(parts[0]);
                System.out.println(parts[1]);
                System.out.println(parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    /*
        List<User> users = new ArrayList<>();
        users.add(new User("Linus", "linusbage@gmail.com", 29));
        users.add(new User("Yahya", "yahya@hotmail.com", 33));

        Path path = Path.of("users.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
            for (User user : users){
                writer.write(user.getName() + ":" + user.getEmail() + ":" + user.getAge());
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();

        }

     */
    }

}
