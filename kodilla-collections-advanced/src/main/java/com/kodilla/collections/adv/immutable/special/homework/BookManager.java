package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {
    public static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book x = new Book(title, author);
        checkList(x);
        books.add(x);
        return x;
    }

    private static void checkList(Book b){
        for (Book book : books) {
            if (book.getAuthor() == b.getAuthor() && book.getTitle() == b.getTitle()) {
                System.out.println("Jest");
            }
        }
    }
}