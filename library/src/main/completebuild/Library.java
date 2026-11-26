package main.completebuild;

import java.util.*;
import java.util.logging.Logger;

public class Library {
    private static final Logger LOGGER = Logger.getLogger(Library.class.getName());

    private List<Media> mediaList = new ArrayList<>();
    private Map<String, Media> mediaById = new HashMap<>();
    private List<Loan> loanHistory = new ArrayList<>();

    public boolean addMedia(Media media) {
        if (mediaById.containsKey(media.getId())) {
            return false;
        }
        mediaList.add(media);
        mediaById.put(media.getId(), media);
        return true;
    }

    public Media getMediaById(String id) {
        return mediaById.get(id);
    }

    public List<Media> getSorgtedMedia() {
        List<Media> sortedMedia = new ArrayList<>();
        Collections.sort(sortedMedia);
        return sortedMedia;
    }

    public Set<String> getBorrowers() {
        Set<String> borrowers = new HashSet<>();
        for (Loan loan : loanHistory) {
            borrowers.add(loan.getBorrower());
        }
        return borrowers;
    }

    public boolean borrow(String id, String borrower) {
        Media media = mediaById.get(id);
        if (media == null) {
            LOGGER.info("Media not found");
            return false;
        }
        if (!media.borrow()) {
            LOGGER.info("Media already borrowed");
            return false;
        }
        LOGGER.info(borrower + " lånade " + media.getTitle());
        Loan loan = new Loan(media, borrower);
        loanHistory.add(loan);
        return true;
    }

    public Media[] getSorted() {
        return null;
    }
}
