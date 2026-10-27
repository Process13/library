package main.Gruppövning;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<Song> songList = new ArrayList<>();

        songList.add(new Song("Sabaton", "40:1"));
        songList.add(new Song("Sabaton", "Bismark"));
        songList.add(new Song("Sabaton", "En Livstid i Krig"));
        songList.add(new Song("Scorpions", "Still loving you"));
        songList.add(new Song("Scorpions", "Always somewhere"));
        songList.add(new Song("Scorpions", "Send me an Angel"));
        songList.add(new Song("Bring me the horizon", "Happy Song"));
        songList.add(new Song("Sabaton", "Livgardet"));
        songList.add(new Song("Bring me the horizon", "Mantra"));
        songList.add(new Song("Bring me the horizon", "Empire"));

        for (Song song : songList) {
            System.out.println(song);
        }

        //Set<String>
    }
}
