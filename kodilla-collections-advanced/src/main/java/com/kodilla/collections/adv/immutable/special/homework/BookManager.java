package com.kodilla.collections.adv.immutable.special.homework;

import java.util.LinkedList;
import java.util.List;

public class BookManager {
    List<Book> books = new LinkedList<>();
    BookComparator bookComparator = new BookComparator();

    public Book createBook(String title, String author) {
        return new Book(title, author);
    }

    public List<Book> createBookList(Book book) {
        if (!books.contains(book))
            books.add(book);
        return books;
    }

    public void printBooks() {
        for (Book book : books)
            System.out.println(book);
    }
}