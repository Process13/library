package main.se_library;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args){
        //StringBuilder builder = new StringBuilder();
        //builder.
        //LocalDate today = LocalDate.now();

        Scanner scan = new Scanner(System.in);
        System.out.print("Ange namn: ");
        String name = scan.nextLine();
        System.out.print("\nAnge ålder: ");
        byte age = scan.nextByte();
        scan.nextLine();
        System.out.print("\nAnge favoritfärg: ");
        String favoriteColour = scan.nextLine();
        System.out.print("\nAnge favoritnummer: ");
        int favoriteNumber = scan.nextInt();
        scan.close();

        name = name.trim();
        int nameLength = name.length();
        System.out.println(name.toUpperCase());
        if (favoriteColour.equalsIgnoreCase("blå")){
            System.out.println("Blå är också en fin färg.");
        } else {
            System.out.println(favoriteColour.trim());
        }
        System.out.print(Math.max(favoriteNumber, 10));
        int randomNumber = (int) Math.ceil(Math.random()*10);
        if (randomNumber == favoriteNumber){
            System.out.println("Du gissade rätt");
        }
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate inAWeek = today.plusDays(7);
        System.out.println(inAWeek);
        String[] activities = {"Programmera", "Spela", "Träna", "Duscha", "Äta"};
        for (String s : activities){
            System.out.println(s);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(age);
        builder.append(favoriteColour);
        builder.append(favoriteNumber);
        System.out.println(builder);
    }
}
