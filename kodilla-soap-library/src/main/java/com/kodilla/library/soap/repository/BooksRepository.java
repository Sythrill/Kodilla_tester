package com.kodilla.library.soap.repository;

import com.kodilla.library.soap.Book;
import com.kodilla.library.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book scifiBook = new Book();
        scifiBook.setSignature("123");
        scifiBook.setAuthor("Terry Pratchett");
        scifiBook.setTitle("The Colour of Magic");
        scifiBook.setYear(1983);
        scifiBook.setGenre(Genre.SCI_FI);
        books.put(scifiBook.getSignature(), scifiBook);

        Book fantasyBook = new Book();
        fantasyBook.setSignature("456");
        fantasyBook.setAuthor("Andrzej Sapkowski");
        fantasyBook.setTitle("The Last Wish");
        fantasyBook.setYear(1993);
        fantasyBook.setGenre(Genre.FANTASY);
        books.put(fantasyBook.getSignature(), fantasyBook);

        Book techBook = new Book();
        techBook.setSignature("789");
        techBook.setAuthor("Kathy Sierra");
        techBook.setTitle("Java, Head First");
        techBook.setYear(2011);
        techBook.setGenre(Genre.TECH);
        books.put(techBook.getSignature(), techBook);

        Book crimeBook = new Book();
        crimeBook.setSignature("369");
        crimeBook.setAuthor("Joanna Chmielewska");
        crimeBook.setTitle("Wszyscy jesteśmy podejrzani");
        crimeBook.setYear(1988);
        crimeBook.setGenre(Genre.CRIME);
        books.put(crimeBook.getSignature(), crimeBook);

    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the course's name.");
        return books.get(signature);
    }
}
