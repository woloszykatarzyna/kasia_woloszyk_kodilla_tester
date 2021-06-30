package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book x = new Book(title, author);
        books.add(x);
        if (books.contains(x)) {
            return x;
        } else {
            books.add(x);
            return x;
        }
    }
}