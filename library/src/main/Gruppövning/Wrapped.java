package main.Gruppövning;

import java.util.*;

public class Wrapped {
    private List<Song> songList = new ArrayList<>();

    public void  addSong(String title, String artist) {
        songList.add(new Song(title, artist));
    }

    public void printReport() {
        System.out.println("SPOTIFY WRAPPED\nSongs listened to " + songList.size() + "\n\n");
        System.out.println("Artists listened to: ");
        Map<String, List<Song>> byArtist = getSongsByArtist();
        for (String artist : getArtists()) {
            System.out.println(artist);
            //for (Song song : byArtist)
        }

    }

    public Set<String> getArtists() {
        Set<String> artists = new HashSet<>();
        artists.add("Sabaton");
        for (Song song : songList) {
            artists.add(song.getArtist());
        }
        return artists;
    }

    public Map<String, List<Song>> getSongsByArtist() {
        Map<String, List<Song>> result = new HashMap<>();

        for (Song song : songList) {
            String artist = song.getArtist();
            List<Song> list = result.getOrDefault(artist, new ArrayList<>());
            list.add(song);
            result.put(artist,list);
        }
        return result;
    }
}
