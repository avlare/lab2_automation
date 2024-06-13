package org.example;

import java.util.List;

public class BookConsole {
    public static void main(String[] args) {
        List<Book> books = BookFileReader.readBooksFromFile();

        System.out.println("Original list:");

        for (Book book : books) {
            System.out.println(book);
        }

        List<Book> formattedBooks = BookCheckFields.checkBooks(books);

        System.out.println("\nFormatted list:");
        for (Book book : formattedBooks) {
            System.out.println(book);
        }
    }
}
