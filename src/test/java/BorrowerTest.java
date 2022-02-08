import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("The Crow Road", "Ian Rankin", "Mystery");
        library.addBook(book);
    }

    @Test
    public void canGetCollectionSize() {
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void canAddBook() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.getCollection());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.getCollection());
        assertEquals(0, library.getBookCount());
    }
}
