package main.polymorfism;

public class LibraryLaptop implements Borrowable {

    boolean randomName;

    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable(){
        return randomName;
    }
}
