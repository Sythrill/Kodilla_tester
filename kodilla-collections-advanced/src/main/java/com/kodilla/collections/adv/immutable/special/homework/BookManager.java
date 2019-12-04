package com.kodilla.collections.adv.immutable.special.homework;

import java.util.LinkedList;
import java.util.List;

public class BookManager {
    List<Book> books = new LinkedList<>();

    public Book creteBook(String title, String author) {
        return new Book(title, author);
    }

    public List<Book> creteBookList(String title, String author) {
        if (!books.contains(new Book(title, author)))
            books.add(new Book(title, author));
        return books;
    }

    public void printBooks() {
        for (Book book : books)
            System.out.println(book);
    }
}
