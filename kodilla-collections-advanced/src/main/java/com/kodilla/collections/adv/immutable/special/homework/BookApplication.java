package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book a = BookManager.createBook("Pierwsza", "Jan Kowalski");
        Book b = BookManager.createBook("Druga", "Jan Kowalski");
        Book c = BookManager.createBook("Jeden", "Adam Nowak");
        Book d = BookManager.createBook("Jeden", "Adam Nowak");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(c.equals(d));
    }
}
