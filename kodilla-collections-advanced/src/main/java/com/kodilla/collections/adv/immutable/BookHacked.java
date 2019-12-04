package com.kodilla.collections.adv.immutable;

public class BookHacked  {
    private String realTitle;

    public BookHacked(String author, String title) {
        realTitle = title;
    }

    public void modifyTitle(String newTitle) {
        realTitle = newTitle;
    }


    public String getTitle() {
        return realTitle;
    }
}
