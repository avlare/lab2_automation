package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class BookCheckFields {
    public static List<Book> checkBooks(List<Book> books) {
        for (Book book : books) {
            if (StringUtils.isEmpty(book.getTitle())) {
                book.setTitle("undefined");
            }

            if (StringUtils.isEmpty(book.getAuthor())) {
                book.setAuthor("undefined");
            }

            if (StringUtils.isEmpty(book.getYear())) {
                book.setYear("undefined");
            }

            String truncatedTitle = StringUtils.abbreviate(book.getTitle(), 20);
            book.setTitle(truncatedTitle);

            if (!"undefined".equals(book.getAuthor())) {
                String capitalizedAuthor = StringUtils.capitalize(book.getAuthor());
                book.setAuthor(capitalizedAuthor);
            }
        }
        return books;
    }
}