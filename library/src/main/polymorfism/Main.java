package main.polymorfism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(new Movie("Movie 1", 1892, 3214));
        mediaList.add(new Movie("Movie 2", 1948, 1423));
        mediaList.add(new AudioBook("Audio Book 1", 2028, "Gubbe"));
        mediaList.add(new AudioBook("Audio Book 2", 1999, "Lasse"));
        mediaList.add(new Music("Music 1", 982, "Fyn"));
        mediaList.add(new Music("Music 2", -8821, "Unknown"));



        for (int i = 0; i<mediaList.size(); i++){
            mediaList.get(i).showInfo();
            if (mediaList.get(i) instanceof Movie ){
                ((Movie) mediaList.get(i)).showTrailer();
            }
            mediaList.get(i).play();
        }
    }
}
