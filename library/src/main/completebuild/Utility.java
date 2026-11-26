package main.completebuild;

public class Utility {
    public static void showCatalog(Library library){
        for (Media media : library.getSorgtedMedia()){
            System.out.println(media);
        }
    }
    public static void showPrints(Library library){

    }
}
