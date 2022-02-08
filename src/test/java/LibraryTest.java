import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Crow Road", "Ian Rankin", "Mystery");
        book2 = new Book("Espedair Street", "Ian Rankin", "Thriller");

    }

    @Test
    public void canCountBooksInLibrary() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void checkBookCapacityIsReached__true() {
        library = new Library(2);
        library.addBook(book1);
        library.addBook(book2);
        assertTrue(library.isAtCapacity());
    }

    @Test
    public void checkBookCapacityIsReached__false() {
        library = new Library(2);
        library.addBook(book1);
        assertFalse(library.isAtCapacity());
    }

    @Test
    public void canRemoveBook() {
        library = new Library(2);
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.getBookCount() );
    }

    @Test
    public void canCountByGenre() {
        library.addByGenre(book1.getGenre());
        library.addByGenre(book1.getGenre());
        library.addByGenre(book2.getGenre());
        assertEquals(2, library.countByGenre(book1.getGenre()));
        assertEquals(1, library.countByGenre(book2.getGenre()));

    }
}
