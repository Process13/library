package main.collections;

import java.util.*;

public class Demo {
    static void main(String[] args) {

        Map<String, Song> mapDemo = new HashMap<>();

        mapDemo.put("slot1",
                new Song("Pattern Recognition", "Neuro", 246));
        mapDemo.put("slot2",
                new Song("Dancing Queen", "ABBA", 231));
        mapDemo.put("slot3",
                new Song("Pattern Recognition", "Neuro", 242));
        mapDemo.put("slot4",
                new Song("Dancing Queen", "ABBA", 261));
        System.out.println("Slot 1: " + mapDemo.get("slot1"));
        System.out.println("Finns slot 2? " + mapDemo.containsKey("slot2"));

        for (Map.Entry<String, Song> entry : mapDemo.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /*
        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("Pattern Recognition", "Neuro", 246));
        playlist.add(new Song("Dancing Queen", "ABBA", 231));
        //playlist.add(new Song())


        System.out.println(playlist.size());
        Song first = playlist.remove(0);
        System.out.println(first);
        System.out.println(playlist.size());

        Set<String> artists = new HashSet<>();
        for (Song song : playlist) {
            artists.add(song.getArtist());
        }



        System.out.println(playlist.size());
        System.out.println("Artist: " + artists.size());


        for (Song song : playlist) {
            System.out.println("Song: " + song);
        }



        Song kopia = new Song("Pattern Recognition", "Neuro", 246);
        System.out.println(
                "Finns den här låten redan? "
                + playlist.contains(kopia)
        );

         */

    }
}
