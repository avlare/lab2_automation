import org.example.Book;
import org.example.BookCheckFields;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void testCheckBooks() {
        List<Book> books = Arrays.asList(
                new Book("Назва книги 1", "Автор 1", "2023"),
                new Book("Назва книги 2", "Автор 2", ""),
                new Book("Назва книги дуже дуже дуже дуже довга 3", "", "2022"),
                new Book("", "Автор 4", "2021"),
                new Book("Назва книги 5", "Автор 5", "2020")
        );

        List<Book> checkedBooks = BookCheckFields.checkBooks(books);

        assertEquals("Назва книги 1", checkedBooks.get(0).getTitle());
        assertEquals("Автор 1", checkedBooks.get(0).getAuthor());
        assertEquals("2023", checkedBooks.get(0).getYear());

        assertEquals("Назва книги дуже ...", checkedBooks.get(2).getTitle()); //'cause the title is so long
        assertEquals("undefined", checkedBooks.get(2).getAuthor());
        assertEquals("2022", checkedBooks.get(2).getYear());

        assertEquals("undefined", checkedBooks.get(3).getTitle());
        assertEquals("Автор 4", checkedBooks.get(3).getAuthor());
        assertEquals("2021", checkedBooks.get(3).getYear());
    }
}
