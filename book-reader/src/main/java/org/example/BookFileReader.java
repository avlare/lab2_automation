package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookFileReader {
    public static List<Book> readBooksFromFile() {
        List<Book> allBooks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("book-reader\\src\\main\\resources\\list_books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    String year = parts[2].trim();
                    allBooks.add(new Book(title, author, year));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allBooks;
    }
}