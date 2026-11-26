package main.completebuild;

import java.time.LocalDate;

public class Loan {

    private Media media;
    private String borrower;
    private LocalDate borrowedOn;
    private LocalDate dueDate;


    public Loan(Media media, String borrower) {
        this.media = media;
        this.borrower = borrower;
        this.borrowedOn = LocalDate.now();
        this.dueDate = borrowedOn.plusDays(28);
    }


    public String getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowedOn() {
        return borrowedOn;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isOverdue(LocalDate today){
        return today.isAfter(dueDate);
    }


    @Override
    public String toString(){
        return media.getTitle() + " lånades av " + borrower + " åter senast " + dueDate;
    }



}
