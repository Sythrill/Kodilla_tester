package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.creteBook("Ala ma kota", "Nieznay");
        Book book2 = bookManager.creteBook("Mysz na wczasach", "Kot w butach");
        Book book3 = bookManager.creteBook("Bolek i Lolek", "Tosia");
        Book book4 = bookManager.creteBook("Bolek i Lolek", "Tosia");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book2.equals(book3));
        System.out.println(book3.equals(book4));

        bookManager.creteBookList("Ala ma kota", "Nieznay");
        bookManager.creteBookList("Mysz na wczasach", "Kot w butach");
        bookManager.creteBookList("Bolek i Lolek", "Tosia");
        bookManager.creteBookList("Bolek i Lolek", "Tosia");

        bookManager.printBooks();
        for(Book book : bookManager.books)
            System.out.println(book.hashCode());
    }
}
