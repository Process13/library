package main.arv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Book("pippi", "Astrid Lindgren", "barn", 1950, false, 73));
        mediaList.add(new Movie("filmnamn", "Regisör", "ganger", 1273, true, 938922));
        mediaList.add(new AudioBook("ljudbok", "författare", "rymden", 3023, false, 99999999));

        for(Media media : mediaList){
            System.out.println(media.title + '\n' + media.creator);
        }
    }
}
