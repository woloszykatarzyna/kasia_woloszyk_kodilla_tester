import java.util.Objects;
import java.util.Scanner;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Object of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }
    public static void main(String[] args) {
        Book tolkien = (Book) Book.of("Tolkien", "Hobbit");
        System.out.println(tolkien.author + " "+ tolkien.title);
    }
}

